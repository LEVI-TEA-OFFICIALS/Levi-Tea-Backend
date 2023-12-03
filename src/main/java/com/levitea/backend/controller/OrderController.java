package com.levitea.backend.controller;

import com.levitea.backend.dao.model.Order;
import com.levitea.backend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/orders")
    public Order addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrderById(@PathVariable("id") Long id){
        orderService.deleteOrderById(id);
    }

    @PutMapping("/orders")
    public Order updateOrder(@RequestBody Order order){
        return orderService.updateOrder(order);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders(){
        List<Order> allOrders =  orderService.getAllOrders();
        return (allOrders != null) ? ResponseEntity.ok(allOrders) : ResponseEntity.notFound().build();
    }

    @GetMapping("/orders/{id}")
    public Optional<Order> getOrderById(@PathVariable("id") Long id){
        return orderService.getOrderById(id);
    }


}
