package com.levitea.backend.service;

import com.levitea.backend.dao.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product addProduct(Product product);

    void deleteProductById(Long id);

    Product updateProduct(Product product);

    List<Product> getAllProducts();

    Optional<Product> getProductById(Long id);


}
