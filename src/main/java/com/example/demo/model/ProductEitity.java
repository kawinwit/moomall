package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Product")
public class ProductEitity {
    public  ProductEitity(){

    }

    public ProductEitity(String productId, String name, String img) {
        this.productId = productId;
        this.name = name;
        this.img = img;
    }

    @Id
    private String productId;
    private String name;
    private String img;



}
