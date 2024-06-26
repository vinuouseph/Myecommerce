package com.example.myecomm;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myecomm.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}