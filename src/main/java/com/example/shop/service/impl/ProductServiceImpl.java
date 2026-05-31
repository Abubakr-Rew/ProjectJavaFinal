package com.example.shop.service.impl;

import com.example.shop.entity.Product;
import com.example.shop.repository.ProductRepository;
import com.example.shop.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public Product save(Product p) {
        return repo.save(p);
    }

    @Override
    public Product getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public List<Product> getAll() {
        return repo.findAll();
    }

    @Override
    public Product updateStock(Long id, int stock) {
        Product p = getById(id);
        p.setStock(stock);
        return repo.save(p);
    }
}