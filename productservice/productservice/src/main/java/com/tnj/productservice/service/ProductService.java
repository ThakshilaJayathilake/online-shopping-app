package com.tnj.productservice.service;

import com.tnj.productservice.dto.ProductRequest;
import com.tnj.productservice.model.Product;

public class ProductService {
    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
    }
}
