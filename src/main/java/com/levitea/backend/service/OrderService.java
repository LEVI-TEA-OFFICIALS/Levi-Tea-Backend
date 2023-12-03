package com.levitea.backend.service;


import com.levitea.backend.dao.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    Order addOrder(Order product);

    void deleteOrderById(Long id);

    Order updateOrder(Order product);

    List<Order> getAllOrders();

    Optional<Order> getOrderById(Long id);
    
}
