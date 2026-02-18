package com.example.Blog.API.controller;

import com.example.Blog.API.entity.UserEntity;
import com.example.Blog.API.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService= userService;
    }
    @PostMapping("/register")
    public UserEntity registerUser(@RequestBody UserEntity userEntity){
        return userService.registerUser(userEntity);
    }
    @GetMapping
    public List<UserEntity> findAllUser(){
        return userService.getAllUsers();
    }
}
