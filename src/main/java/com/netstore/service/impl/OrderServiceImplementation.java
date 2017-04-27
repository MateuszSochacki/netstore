package com.netstore.service.impl;

import com.netstore.model.Product;
import com.netstore.model.repository.ProductRepository;
import com.netstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by msoch_000 on 27-04-2017.
 */
@Service
public class OrderServiceImplementation implements OrderService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void processOrder(String productId, int count) {

        Product productById = productRepository.getProductById(productId);
        if(productById.getUnitsInStock() < count){
            throw new IllegalArgumentException("Zbyt mało towaru. Obecna liczba sztuk w magazynie: "+ productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock() - count);
    }
}
