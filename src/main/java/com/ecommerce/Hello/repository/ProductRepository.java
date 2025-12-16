package com.ecommerce.Hello.repository;


import com.ecommerce.Hello.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}