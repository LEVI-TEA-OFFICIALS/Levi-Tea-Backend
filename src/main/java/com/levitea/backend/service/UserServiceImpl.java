package com.levitea.backend.service;

import com.levitea.backend.dao.model.User;
import com.levitea.backend.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    //get user details by id
    @Override
    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }


    //get user by username
    @Override
    public User getUserByUsername(String username){
        return (User) userRepository.findByUsername(username);
    }

    @Override
    //delete a user based on ID
    public Optional<User> deleteUserById(Long id){
        userRepository.deleteById(id);
        return null;
    }

    //update a user based on ID
    @Override
    public User updateUser(User user, Long id) {
        user.setId(id);
        return userRepository.save(user);

    }


}
