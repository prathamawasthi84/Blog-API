package com.example.Blog.API.dto;

import jakarta.validation.constraints.NotBlank;

public class UserDTO {
    private Long userId;
    @NotBlank
    private String userName;
    @NotBlank
    private String userEmail;
    public UserDTO(){
    }
    public UserDTO(Long userId,String userName,String userEmail){
        this.userId=userId;
        this.userName=userName;
        this.userEmail=userEmail;
    }
    //Getters
    public Long getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    //Setters
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
