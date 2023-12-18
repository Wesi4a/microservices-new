package com.wesi4a.productservice.repository;

import com.wesi4a.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,String> {
}
