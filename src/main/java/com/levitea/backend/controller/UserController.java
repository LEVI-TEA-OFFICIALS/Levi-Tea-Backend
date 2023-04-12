package com.levitea.backend.controller;

import com.levitea.backend.model.User;
import com.levitea.backend.service.UserService;
import com.levitea.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAlllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/getUserById/{id}")
    Optional<User> getUserById(@PathVariable("id") Long id){return userService.getUserById(id);}

//    @GetMapping("/getUserByUsername/{username}")
//    Optional<User> getUserByUsername(@PathVariable("username") String username){return Optional.ofNullable(userService.getUserByUsername(username));}

    @DeleteMapping ("/deleteUserById/{id}")
    Optional<User> deleteUserById(@PathVariable("id") Long id){return userService.deleteUserById(id);}


}
