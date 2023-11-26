package com.levitea.backend.controller;

import com.levitea.backend.dao.model.Customer;
import com.levitea.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;



@RestController
//@CrossOrigin(origins = "*", methods = {RequestMethod.DELETE,RequestMethod.GET})
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    List<Customer> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/getUserById/{id}")
    Optional<Customer> getUserById(@PathVariable("id") Long id){return userService.getUserById(id);}

    @GetMapping("/getUserByUsername/{username}")
    Optional<Customer> getUserByUsername(@PathVariable("username") String username){
        return Optional.ofNullable(userService.getUserByUsername(username));}

    @DeleteMapping("/deleteUserById/{id}")
    Optional<Customer> deleteUserById(@PathVariable("id") Long id){return userService.deleteUserById(id);}

}
