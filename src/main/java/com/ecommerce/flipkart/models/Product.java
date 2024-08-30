package com.ecommerce.flipkart.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String description;
    private String title;
    private String image;
    private Double price;
    private Category category;
}
