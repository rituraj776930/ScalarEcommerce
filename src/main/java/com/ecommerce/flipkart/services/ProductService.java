package com.ecommerce.flipkart.services;

import com.ecommerce.flipkart.models.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(Long id);

    List<Product> getAllProducts();
}
