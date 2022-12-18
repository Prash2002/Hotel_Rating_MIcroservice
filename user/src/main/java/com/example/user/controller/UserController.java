package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.repository.UserRepo;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User u){
        return userService.createUser(u);
    }
    //TODO: PUT, DEL MAPPING
}
