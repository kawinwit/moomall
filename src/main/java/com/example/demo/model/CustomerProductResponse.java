package com.example.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class CustomerProductResponse {
        private List<BookProductEntity> bookProductEntityList;
        private Integer allItem;
}
