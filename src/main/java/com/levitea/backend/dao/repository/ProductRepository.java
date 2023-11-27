package com.levitea.backend.dao.repository;

import com.levitea.backend.dao.model.Product;
import com.levitea.backend.dao.model.ShopOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    ShopOwner findByUsername(String username);
}
