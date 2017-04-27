package com.netstore.service;

import com.netstore.model.Product;

import java.util.List;

/**
 * Created by msoch_000 on 27-04-2017.
 */
public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(String productID);
    List<Product> getProductsByCategory(String category);
}
