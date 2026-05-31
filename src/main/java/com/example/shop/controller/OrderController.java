package com.example.shop.controller;

import com.example.shop.entity.Order;
import com.example.shop.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Order create(@RequestBody Order order) {
        return service.create(order);
    }

    @PostMapping("/{id}/pay")
    public Order pay(@PathVariable Long id) {
        return service.pay(id);
    }
}