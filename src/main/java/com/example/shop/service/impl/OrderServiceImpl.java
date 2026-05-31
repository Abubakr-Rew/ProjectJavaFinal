package com.example.shop.service.impl;

import com.example.shop.entity.Order;
import com.example.shop.entity.OrderStatus;
import com.example.shop.entity.Product;
import com.example.shop.repository.OrderRepository;
import com.example.shop.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repo;

    public OrderServiceImpl(OrderRepository repo) {
        this.repo = repo;
    }

    public Order create(Order order) {

        double total = 0;

        for (Product p : order.getProducts()) {
            if (p.getStock() <= 0)
                throw new RuntimeException("Out of stock: " + p.getName());

            total += p.getPrice();
            p.setStock(p.getStock() - 1);
        }

        order.setTotalPrice(total);
        order.setStatus(OrderStatus.CREATED);

        return repo.save(order);
    }

    public Order pay(Long id) {
        Order o = repo.findById(id).orElseThrow();

        if (o.getStatus() != OrderStatus.CREATED)
            throw new RuntimeException("Invalid status");

        o.setStatus(OrderStatus.PAID);

        return repo.save(o);
    }
}