package com.ecommerce.flipkart.services;

import com.ecommerce.flipkart.dto.FakeStoreProductDto;
import com.ecommerce.flipkart.models.Category;
import com.ecommerce.flipkart.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate;

    FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Product convertFakeStoreDtoToProduct(FakeStoreProductDto fakeStoreProductDto){
        Product product = new Product();
        Category category = new Category();
        category.setDescription(fakeStoreProductDto.getDescription());

        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setImage(fakeStoreProductDto.getImage());
        product.setCategory(category);
        product.setDescription(fakeStoreProductDto.getDescription());

        return product;
    }
    @Override
    public Product getProduct(Long id) {
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDto.class);
        if(fakeStoreProductDto == null){
            return null;
        }
        Product product = convertFakeStoreDtoToProduct(fakeStoreProductDto);
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }
}
