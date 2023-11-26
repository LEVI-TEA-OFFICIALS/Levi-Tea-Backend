package com.levitea.backend.service.serviceImpl;

import com.levitea.backend.dao.model.Customer;
import com.levitea.backend.dao.repository.UserRepository;
import com.levitea.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

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
        return (Customer) userRepository.findByUsername(username);
    }

    @Override
    //delete a user based on ID
    public Optional<Customer> deleteUserById(Long id){
        userRepository.deleteById(id);
        return null;
    }

    //update a user based on ID
    @Override
    public Customer updateUser(Customer user, Long id) {
        user.setId(id);
        return userRepository.save(user);

    }


}
