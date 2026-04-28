package com.example.ReactiveDemo1.Service;
import com.example.ReactiveDemo1.Mapper.modmap;
import com.example.ReactiveDemo1.Entity.product;
import com.example.ReactiveDemo1.Repository.ProductRepo;
import com.example.ReactiveDemo1.dto.productdto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

@Component
public class ProductService {

    Logger logger = LoggerFactory.getLogger(ProductService.class);

    private ProductRepo productRepo;

    private modmap modmap1;

    @Autowired
    public ProductService(ProductRepo productRepo, modmap modmap1) {
        this.productRepo = productRepo;
        this.modmap1 = modmap1;
    }

    public Flux<product> productFlux() {
        logger.info("productFlux method started.....");
        return Flux.defer(() -> Flux.fromIterable(this.productRepo.findAll()))
                .doOnNext(data->logger.info("data...{}",data))
                .subscribeOn(Schedulers.boundedElastic());

    }

    public Mono<product> findbyid(int id) {
        logger.info("inside findbyid started...");
        return Mono.fromCallable(() -> this.productRepo.findById(id).orElseThrow(() -> new RuntimeException("")))
                .doOnNext(data->logger.info("data...{}",data))
                .subscribeOn(Schedulers.boundedElastic());
    }

//    public Mono<product> Update(int id, productdto productdto)
//    {
//      return   Mono.fromCallable(()->{
//            this.productRepo.findById(id)
//                    .flatMap(data->{
//                            data.setName(productdto.getName());
//                            data.setType(productdto.getType());
//
//                    return this.productRepo.save(data);})
//        }).subscribeOn(Schedulers.boundedElastic());
//    }

    public Mono<product> update(int id, productdto productDTO1) {
        logger.info("inside save started...");
        return Mono.fromCallable(() ->
                        productRepo.findById(id).
                                orElseThrow(() -> new RuntimeException("no data")))
                .map(data -> {
                    data.setName(productDTO1.getName());
                    data.setType(productDTO1.getType());
                    return productRepo.save(data);
                })
                .doOnNext(data->logger.info("data....{}",data))
                .subscribeOn(Schedulers.boundedElastic());


    }

    public Mono<product> save(productdto p) {
        logger.info("inside save started...");

        return Mono.fromCallable(() -> {
            product prod = modmap1.toentity(p);
            return this.productRepo.save(prod);
        }).doOnNext(data->logger.info("data....{}",data)).
                subscribeOn(Schedulers.boundedElastic());
    }


    public Mono<Void> delete(int id) {
      return  Mono.fromCallable(() -> {
            product byId = productRepo.findById(id).orElseThrow(()->new RuntimeException("no data"));
             productRepo.delete(byId);
          return null;
      }).subscribeOn(Schedulers.boundedElastic()).then();
    }

}

//
//    public Mono<product> getById(int id) {
//        List<product> list = List.of(
//                new product(1, "laptop", "John Doe"),
//                new product(2, "key", "Alice Smith"),
//                new product(3, "phone", "Charlie Brown")
//        );
//
//        return list.stream()
//                .filter(product -> product.getId() == id)
//                .findFirst()
//                .map(Mono::just)  // Wrap in Mono
//                .orElseGet(Mono::empty);  // Return empty if not found
//    }
//
//    public Mono<product> update(int id )
//    {
//
//    }


