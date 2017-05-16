package com.netstore.controller;

import com.netstore.model.Product;
import com.netstore.model.repository.ProductRepository;
import com.netstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Created by msoch_000 on 23-04-2017.
 */
@Controller

public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public String list(Model model) {
        model.addAttribute("device", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/products/all")
    public String allProducts(Model model) {
        model.addAttribute("device", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/products/{category}")
    public String getProductsByCategory(Model model, @PathVariable("category")String productCategory) {
        model.addAttribute("device", productService.getProductsByCategory(productCategory));
        return "products";
    }

    @GetMapping("/products")
    public String showForm(Model model) {
        Product product = new Product();
        model.addAttribute("device", productService.getAllProducts());
        model.addAttribute("newProduct", product);
        return "products";
    }

    @PostMapping(value="/products/productsPost")
    public String processForm(@ModelAttribute Product product) {

        productService.saveProduct(product);

        return "redirect:/products";
    }
}
