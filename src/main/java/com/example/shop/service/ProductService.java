package com.example.shop.service;

import com.example.shop.entity.Product;
import java.util.List;

public interface ProductService {

    Product save(Product p);

    Product getById(Long id);

    List<Product> getAll();

    Product updateStock(Long id, int stock);
}