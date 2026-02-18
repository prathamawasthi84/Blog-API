package com.example.Blog.API.service;

import com.example.Blog.API.entity.UserEntity;
import com.example.Blog.API.respository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private  final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public UserEntity registerUser(UserEntity userEntity){
        Optional<UserEntity> existingUser = userRepository.findByUserEmail(userEntity.getUserEmail());
        if(existingUser.isPresent()){
            throw new ResponseStatusException(HttpStatus.CONFLICT,"Email Already Registered");
        }
        else{
           return userRepository.save(userEntity);
        }
    }
    public List<UserEntity> getAllUsers(){
        return  userRepository.findAll();
    }
}
