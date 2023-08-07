package com.levitea.backend.controller;

import com.levitea.backend.exception.UserNotFoundException;
import com.levitea.backend.dao.model.User;
import com.levitea.backend.service.UserService;
import com.levitea.backend.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;



@RestController
//@CrossOrigin(origins = "*", methods = {RequestMethod.DELETE,RequestMethod.GET})
public class UserController {

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
//
////    @GetMapping("/getUserByUsername/{username}")
////    Optional<User> getUserByUsername(@PathVariable("username") String username){return Optional.ofNullable(userService.getUserByUsername(username));}
//
//    @DeleteMapping ("/deleteUserById/{id}")
//    Optional<User> deleteUserById(@PathVariable("id") Long id){return userService.deleteUserById(id);}


      @GetMapping("/user/{id}")
      User getUserById(@PathVariable Long id){
        return userRepository.findById(id)
                .orElseThrow(()-> new UserNotFoundException(id));
      }

      @PutMapping("/user/{id}")
      User updateUser(@RequestBody User newUser,@PathVariable long id){
        return userRepository.findById(id)
                .map(user->{
                    user.setName(newUser.getName());
                    user.setUsername(newUser.getUsername());
                    user.setRank(newUser.getRank());
                    user.setAddress(newUser.getAddress());
                    user.setCity(newUser.getCity());
                    user.setPhoneNo(newUser.getPhoneNo());
                    return userRepository.save(user);
                }).orElseThrow(()->new UserNotFoundException(id));
      }

      @DeleteMapping("user/{id}")
      String deleteUser(@PathVariable Long id){
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }

        userRepository.deleteById(id);
        return "User with id "+id+" has been deleted succesfully  ";
      }



}
