package com.example.demo.repository;

import com.example.demo.model.BookProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookProductRepository extends JpaRepository<BookProductEntity,Integer> {
        List<BookProductEntity> findByCustomerId(String customerId);
}
