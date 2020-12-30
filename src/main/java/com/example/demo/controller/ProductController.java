package com.example.demo.controller;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public ResponseEntity getProductAll(){
        Map<String, Object> resp = new HashMap<>();
        resp.put("result",productService.getAllProduct());
        return ResponseEntity.ok(resp);
    }

    @GetMapping("/product/detail")
    public ResponseEntity getProductDetail(@RequestParam String productId){
        Map<String, Object> resp = new HashMap<>();
        resp.put("result",productService.getProductDetailsById(productId));
        return ResponseEntity.ok(resp);
    }

    @PostMapping("/product/book")
    public ResponseEntity bookProduct(@RequestBody Map map){
        productService.bookProduct(map);
        return ResponseEntity.ok("");
    }
}
