package com.example.ReactiveDemo1.Mapper;
import com.example.ReactiveDemo1.Entity.product;
import com.example.ReactiveDemo1.dto.productdto;
import org.springframework.stereotype.Component;

@Component
public class modmap {

    public productdto todto(product product2)
    {
        productdto product1=new productdto();
        product1.setName(product2.getName());
        product1.setType(product2.getType());
        return product1;
    }

    public product toentity(productdto product2)
    {
        product product1=new product();
        product1.setName(product2.getName());
        product1.setType(product2.getType());
        return product1;
    }
}
