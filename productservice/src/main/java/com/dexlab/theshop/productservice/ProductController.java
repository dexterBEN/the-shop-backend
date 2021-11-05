package com.dexlab.theshop.productservice;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    @GetMapping("/test")
    public String testEndPoint() {
        return "test endpoint work";
    }
}
