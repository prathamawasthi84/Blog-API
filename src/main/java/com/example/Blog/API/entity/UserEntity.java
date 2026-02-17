package com.example.Blog.API.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String userEmail;
    @NotBlank
    private String userPassword;
    public UserEntity(){

    }
    public UserEntity(Long id,String username, String userEmail , String userPassword){
        this.id=id;
        this.username=username;
        this.userEmail=userEmail;
        this.userPassword=userPassword;
    }
    //Getters
    public Long getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getUserEmail(){
        return userEmail;
    }
    public String getUserPassword(){
        return userPassword;
    }
    //Setters
    public void setId(Long id){
        this.id=id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setUserEmail(String userEmail){
        this.userEmail=userEmail;
    }
    public void setUserPassword(String userPassword){
        this.userPassword=userPassword;
    }
}
