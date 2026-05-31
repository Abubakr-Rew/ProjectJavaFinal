package com.example.shop.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Product> products;

    @ManyToOne
    private User user;

    private double totalPrice;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public Long getId() { return id; }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }
}