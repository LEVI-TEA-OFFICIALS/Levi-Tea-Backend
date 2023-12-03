package com.levitea.backend.dao.repository;

import com.levitea.backend.dao.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
