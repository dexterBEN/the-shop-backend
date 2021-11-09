package com.dexlab.theshop.productservice;

import org.springframework.web.bind.annotation.RestController;

import com.dexlab.theshop.productservice.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/product-service")
public class ProductController {

    @Autowired
    ProductService productService;
    
    @GetMapping("/test")
    public String testEndPoint() {
        return "test endpoint work";
    }

    @PostMapping("/product")
    public Product createProduct(
        @RequestParam("name") String name,
        @RequestParam("description") String description,
        @RequestParam("price") String price
    ) {

        Product product =  new Product();
        int parsedInt =  Integer.parseInt(price);
        product.setName(name);
        product.setDescription(description);
        product.setPrice(parsedInt);

        return productService.createProduct(product);
    }   
}
