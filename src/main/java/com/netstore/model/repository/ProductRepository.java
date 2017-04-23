package com.netstore.model.repository;

import com.netstore.model.Product;

import java.util.List;

/**
 * Created by msoch_000 on 23-04-2017.
 */
public interface ProductRepository {

    List<Product> getAllProducts();
}
