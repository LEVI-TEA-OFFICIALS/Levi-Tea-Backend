package com.levitea.backend.service.serviceImpl;


import com.levitea.backend.dao.model.Order;
import com.levitea.backend.dao.repository.OrderRepository;
import com.levitea.backend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order addOrder(Order order){
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }
    
}
