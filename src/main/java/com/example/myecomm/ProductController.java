package com.example.myecomm;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.myecomm.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import java.util.List;

@Controller
class ProductController{

    @Autowired
    private ProductRepository ProductRepository;

    @GetMapping("/addProduct")
    public String showAddProductForm(Model model){  
    model.addAttribute("product", new Product());
    return "product-form";
    }

    @GetMapping("/productslist")
    public String showProductsList(Model model){
        List<Product> ProductList=ProductRepository.findAll();
        model.addAttribute("products", ProductList);
        return "product-list";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product){
        ProductRepository.save(product);

        return "product-display";
    }
}