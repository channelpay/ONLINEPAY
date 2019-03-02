package com.example.store.service.product;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("")
public class ProductServiceImpl implements ProductService {
    private static Map<String, String> product = new HashMap<>();
    static {
        product.put("username", "cao.rc");
    }

    @Override
    public void createProduct(Map<String, String> product) {
        product.put("prductid", product.toString());
    }

    @Override
    public Map<String, String> findAllProduct() {
        if ("".equals(product.get("username"))) {
        }
        return product;
    }

}
