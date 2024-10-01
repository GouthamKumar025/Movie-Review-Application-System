package com.goutham.MovieApplication.controller;

import com.goutham.MovieApplication.entity.User;
import com.goutham.MovieApplication.model.UserModel;
import com.goutham.MovieApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public User saveUserDetails(@RequestBody UserModel userModel){
        return userService.saveUserDetails(userModel);
    }

    @GetMapping("/Users")
    public List<User> getUserDetails(){
        return userService.getUserDetails();
    }

    @GetMapping("/Users/userName/{userName}")
    public List<User> getUserByUserName(@PathVariable("userName") String userName){
        return userService.getUserByUserName(userName);
    }

    @GetMapping("/Users/{id}")
    public List<User> getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/Users/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return "User Details deleted successfully";
    }

    @PutMapping("/Users/updateDetails/{id}")
    public User updateUserDetails(@PathVariable("id") Long id, @RequestBody User userModel){
        return userService.updateUserDetails(id,userModel);
    }

}
