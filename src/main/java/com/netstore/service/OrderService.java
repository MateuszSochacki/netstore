package com.netstore.service;

/**
 * Created by msoch_000 on 27-04-2017.
 */
public interface OrderService {

    void processOrder(String productId, int count);
}
