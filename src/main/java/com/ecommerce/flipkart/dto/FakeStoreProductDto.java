package com.ecommerce.flipkart.dto;

import com.ecommerce.flipkart.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String description;
    private String title;
    private String image;
    private Double price;
    private String category;
}
