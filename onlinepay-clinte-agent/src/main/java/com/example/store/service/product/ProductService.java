package com.example.store.service.product;

import java.util.Map;

public interface ProductService {

    void createProduct(Map<String, String> product);
    
    Map<String, String> findAllProduct();
}
