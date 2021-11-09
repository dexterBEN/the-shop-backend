package com.dexlab.theshop.productservice.repository;

import com.dexlab.theshop.productservice.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository  extends JpaRepository<Product, Long>{
    
}
