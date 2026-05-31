package com.example.shop.controller;

import com.example.shop.entity.Product;
import com.example.shop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}/stock")
    public Product updateStock(@PathVariable Long id, @RequestParam int stock) {
        return service.updateStock(id, stock);
    }
}