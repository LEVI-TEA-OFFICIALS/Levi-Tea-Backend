package com.levitea.backend.service.serviceImpl;

import com.levitea.backend.dao.model.Customer;
import com.levitea.backend.dao.repository.CustomerRepository;
import com.levitea.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository userRepository;

    @Override
    public List<Customer> getAllUsers() {
        return userRepository.findAll();
    }

    //get user details by id
    @Override
    public Optional<Customer> getUserById(Long id){
        return userRepository.findById(id);
    }

    //get user by username
    @Override
    public Customer getUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    //delete a user based on ID
    public Customer deleteUserById(Long id){
        userRepository.deleteById(id);
        return null;
    }

    @Override
    public Customer addCustomer(Customer customer){
        return userRepository.save(customer);
    }

    //update a user based on ID
    @Override
    public Customer updateUser(Customer customer, Long id) {
        return userRepository.save(customer);
    }


}
