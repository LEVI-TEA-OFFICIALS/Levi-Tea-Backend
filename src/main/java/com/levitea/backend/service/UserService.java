package com.levitea.backend.service;


import com.levitea.backend.dao.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    //get all users
    List<User> getAllUsers();

    //get user details by id
    Optional<User> getUserById(Long id);

    //get user by username
    User getUserByUsername(String username);


    //delete a user based on ID
    Optional<User> deleteUserById(Long id);

    //update a user based on ID
    User updateUser(User user, Long id);


}
