package com.example.myecomm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.myecomm.model.Cart;
import org.springframework.web.bind.annotation.*;
@Controller
class CartController{
    @Autowired
    private CartRepository CartRepository;
    
    @GetMapping("/cart")
    public String cart(Model model){
        Long count = CartRepository.count();
        model.addAttribute("count", count);
        Cart cart = new Cart();
        cart.setItem("dummy");
        cart.setUid("0");
        CartRepository.save(cart);
        return "cart-list";
    }
    
}