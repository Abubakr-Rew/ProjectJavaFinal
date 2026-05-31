package com.example.shop.service;

import com.example.shop.entity.Order;

public interface OrderService {
    Order create(Order order);
    Order pay(Long id);
}