package com.example.demo.repository;

import com.example.demo.model.ProductEitity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEitity,String> {
}
