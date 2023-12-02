package com.levitea.backend.service;


import com.levitea.backend.dao.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    //get all users
    List<Customer> getAllUsers();

    //get user details by id
    Optional<Customer> getUserById(Long id);

    //get user by username
    Customer getUserByUsername(String username);

    Customer addCustomer(Customer customer);

    //delete a user based on ID
    Customer deleteUserById(Long id);

    //update a user based on ID
    Customer updateUser(Customer user, Long id);

}
