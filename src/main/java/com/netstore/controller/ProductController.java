package com.netstore.controller;

import com.netstore.model.Product;
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

    @RequestMapping("/products")
    public String list(Model model) {
        Product product = new Product("P1234","iPhone 5s", new BigDecimal(500));
        product.setDescription("Apple iPhone 5s, smartfon z 4-calowym wyświetlaczem o rozdzielczości 640x1136 oraz 8-megapikselowym aparatem");
        product.setCategory("Smart Phone");
        product.setManufacturer("Apple");
        product.setUnitsInStock(1000);
        model.addAttribute("product", product);
        return "products";
    }
}
