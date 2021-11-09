package com.dexlab.theshop.productservice;

import com.dexlab.theshop.productservice.model.Product;
import com.dexlab.theshop.productservice.repository.IProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    IProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
