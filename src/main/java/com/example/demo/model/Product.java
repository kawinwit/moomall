package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Product {

    private String productId;
    private String name;
    private String imgUrl;
    private String color;
    private String size;

}