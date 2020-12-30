package com.example.demo.controller;

import com.example.demo.model.BookProductEntity;

import com.example.demo.model.CustomerProductResponse;
import com.example.demo.repository.BookProductRepository;
import com.example.demo.repository.CustomerProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @Autowired
    BookProductRepository bookProductRepository;


    @GetMapping("/customer/product")
    public ResponseEntity getCustomerProduct(){
        Map<String, Object> resp = new HashMap<>();
        CustomerProductResponse customerProductResponse =new CustomerProductResponse();
       List<BookProductEntity> bookProductEntity = bookProductRepository.findByCustomerId("1-customer-test");
        customerProductResponse.setBookProductEntityList(bookProductEntity);
        Integer allItem = 0;
       for(BookProductEntity bookItem : bookProductEntity){
           allItem += bookItem.getQuantity();
       }
        customerProductResponse.setAllItem(allItem);
        resp.put("result",customerProductResponse);
        return ResponseEntity.ok(resp);
    }

}
