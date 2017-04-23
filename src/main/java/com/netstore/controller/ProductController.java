package com.netstore.controller;

import com.netstore.model.Product;
import com.netstore.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;

/**
 * Created by msoch_000 on 23-04-2017.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/products")
    public String list(Model model) {
        model.addAttribute("product", productRepository.getAllProducts());
        return "products";
    }
}
