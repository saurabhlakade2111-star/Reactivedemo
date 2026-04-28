package com.example.ReactiveDemo1.Repository;

import com.example.ReactiveDemo1.Entity.product;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<product,Integer> {
}
