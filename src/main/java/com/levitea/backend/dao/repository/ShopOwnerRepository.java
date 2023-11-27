package com.levitea.backend.dao.repository;

import com.levitea.backend.dao.model.Customer;
import com.levitea.backend.dao.model.ShopOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopOwnerRepository extends JpaRepository<ShopOwner,Long> {
    ShopOwner findByUsername(String username);
}
