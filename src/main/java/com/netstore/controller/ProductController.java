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
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping
    public String list(Model model) {
        model.addAttribute("product", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/all")
    public String allProducts(Model model) {
        model.addAttribute("product", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/{category}")
    public String getProductsByCategory(Model model, @PathVariable("category")String productCategory) {
        model.addAttribute("product", productService.getProductsByCategory(productCategory));
        return "products";
    }

    @GetMapping
    public String showForm(Model model) {
        Product product = new Product();

        model.addAttribute("product", product);
        return "products";
    }

    @PostMapping("/productsPost")
    public String processForm(@ModelAttribute(value="product")Product product) {

        productService.saveProduct(product);

        return "products";
    }
}
