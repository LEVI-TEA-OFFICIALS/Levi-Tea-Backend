package com.levitea.backend.service;


import com.levitea.backend.model.User;

import java.util.Optional;

public interface UserService {

    //get user details by id
    Optional<User> getUserById(Long id);

    //get user by username
    User getUserByUsername(String username);


    //delete a user based on ID
    Optional<User> deleteUserById(Long id);

    //update a user based on ID
    User updateUser(User user, Long id);


}
