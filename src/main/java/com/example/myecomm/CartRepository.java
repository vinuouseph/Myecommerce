package com.example.myecomm;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myecomm.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}