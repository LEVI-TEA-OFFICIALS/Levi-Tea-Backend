package com.levitea.backend.controller;

import com.levitea.backend.dao.model.Product;
import com.levitea.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("products")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable("id") Long id){
        productService.deleteProductById(id);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> allProducts =  productService.getAllProducts();
        return (allProducts != null) ? ResponseEntity.ok(allProducts) : ResponseEntity.notFound().build();
    }

    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

}
