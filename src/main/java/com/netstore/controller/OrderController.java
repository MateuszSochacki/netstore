package com.netstore.controller;

import com.netstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by msoch_000 on 27-04-2017.
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/order/P1234/2")
    public String process() {

        orderService.processOrder("P1234", 2);
        return "redirect:/products";
    }
}
