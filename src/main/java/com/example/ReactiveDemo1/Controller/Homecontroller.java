package com.example.ReactiveDemo1.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.example.ReactiveDemo1.Entity.product;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import com.example.ReactiveDemo1.Service.ProductService;
import com.example.ReactiveDemo1.dto.productdto;

@RestController
@RequestMapping("/home")
public class Homecontroller {

    Logger logger= LoggerFactory.getLogger(Homecontroller.class);

    @Autowired
    private ProductService productService;
    @PostMapping("/save")
    public Mono<product> save(@RequestBody productdto p1)
    {
        return productService.save(p1);
    }
    @GetMapping("{id}")
    public Mono<product> getid(@PathVariable int id)
    {
        return productService.findbyid(id);
    }

    @GetMapping("all")
    public Flux<product> getid()
    {
        return productService.productFlux();
    }

    @PutMapping("/improve/{id}")
    public Mono<product> getid(@RequestBody productdto p2,@PathVariable int id)
    {
        return productService.update(id,p2);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> delete(@PathVariable int id)
    {
        return productService.delete(id);
    }

}
