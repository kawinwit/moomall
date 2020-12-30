package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Book")
public class BookProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BookId;
    private String customerId;
    private String productId;
    private String name;
    private String img;
    private String size;
    private String color;
    private Integer quantity;


}
