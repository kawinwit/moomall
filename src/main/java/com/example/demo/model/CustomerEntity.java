package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CustomerEntity {

    @Id
    private String customerId;
    private String name;

}
