package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/api/orders")
    public String getOrders() {
        return "List of orders from Order Service!";
    }
}
