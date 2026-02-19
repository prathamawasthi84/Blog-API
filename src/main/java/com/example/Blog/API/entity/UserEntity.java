package com.example.Blog.API.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    @Column(unique = true)
    private String userEmail;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String userPassword;
    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<PostEntity> postEntities= new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnore
    private List<CommentEntity> commentEntities= new ArrayList<>();

    public UserEntity(){

    }
    public UserEntity(Long id,String username, String userEmail , String userPassword){
        this.id=id;
        this.username=username;
        this.userEmail=userEmail;
        this.userPassword=userPassword;
    }
    //Getters
    public List<CommentEntity> getCommentEntities() {
        return commentEntities;
    }
    public List<PostEntity> getPostEntities() {
        return postEntities;
    }
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
    public void setCommentEntities(List<CommentEntity> commentEntities) {
        this.commentEntities = commentEntities;
    }
    public void setPostEntities(List<PostEntity> postEntities) {
        this.postEntities = postEntities;
    }
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
