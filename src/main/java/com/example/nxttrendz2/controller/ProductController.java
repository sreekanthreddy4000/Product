package com.example.nxttrendz2.controller;

import com.example.nxttrendz2.model.*;
import com.example.nxttrendz2.service.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@RestController
public class ProductController {

    @Autowired
    private ProductJpaService productService;

    @GetMapping("/categories/products")
    public ArrayList<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/categories/products/{productId}")
    public Product getProductById(@PathVariable("productId") int productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/categories/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/categories/products/{productId}")
    public Product updateProduct(@PathVariable("productId") int productId, @RequestBody Product product) {
        return productService.updateProduct(productId, product);
    }

    @DeleteMapping("/categories/products/{productId}")
    public void deleteProduct(@PathVariable int productId) {
        productService.deleteProduct(productId);
    }

    @GetMapping("/products/{productId}/category")
    public Category getProductCategory(@PathVariable int productId) {
        return productService.getProductCategory(productId);
    }

}