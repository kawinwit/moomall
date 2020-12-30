package com.example.demo.service;

import com.example.demo.model.BookProductEntity;
import com.example.demo.model.CustomerEntity;
import com.example.demo.model.ProductEitity;
import com.example.demo.repository.BookProductRepository;
import com.example.demo.repository.CustomerProductRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    BookProductRepository bookProductRepository;

    @Autowired
    CustomerProductRepository customerProductRepository;

    public List<ProductEitity> getAllProduct(){
        return  productRepository.findAll();
    }

    public ProductEitity getProductDetailsById(String productId){
       ProductEitity productEitity =  productRepository.findById(productId).get();
        return  productEitity;
    }

    public void bookProduct(Map product){
        String productId = (String) product.get("productId");
        String img = (String) product.get("img");
        String color = (String) product.get("color");
        String size = (String) product.get("size");
        String name = (String) product.get("name");
        Integer _quantity = Integer.parseInt((String)product.get("quantity"));

        BookProductEntity bookProductEntity = new BookProductEntity();
        bookProductEntity.setProductId(productId);
        bookProductEntity.setImg("test.png");
        bookProductEntity.setName(name);
        bookProductEntity.setColor(color);
        bookProductEntity.setSize(size);
        bookProductEntity.setQuantity(_quantity);
        bookProductEntity.setCustomerId("1-customer-test");
        bookProductRepository.save(bookProductEntity);


    }
}
