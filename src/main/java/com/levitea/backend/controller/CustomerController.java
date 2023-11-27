package com.levitea.backend.controller;

import com.levitea.backend.dao.model.Customer;
import com.levitea.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.*;



@RestController
//@CrossOrigin(origins = "*", methods = {RequestMethod.DELETE,RequestMethod.GET})
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    List<Customer> getAllUsers(){
        return customerService.getAllUsers();
    }

    @GetMapping("/getCustomerById/{id}")
    Customer getUserById(@PathVariable("id") Long id){return customerService.getUserById(id);}

    @GetMapping("/getCustomerByUsername/{username}")
    Customer getUserByUsername(@PathVariable("username") String username){
        return customerService.getUserByUsername(username);
    }

    @DeleteMapping("/deleteCustomerById/{id}")
   Customer deleteUserById(@PathVariable("id") Long id){return customerService.deleteUserById(id);}

}
