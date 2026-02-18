package com.example.Blog.API.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    @NotBlank(message = "Title cannot be Empty")
    private String title;
    @NotBlank(message = "Content cannot be Empty")
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    private UserEntity user;
    public PostEntity(){

    }
    public PostEntity(Long postId,String title,String content){
        this.postId=postId;
        this.title= title;
        this.content=content;
    }
    //Getters
    public UserEntity getUser(){
        return user;
    }
    public Long getPostId() {
        return postId;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    //Setters
    public void setUser(UserEntity user){
        this.user=user;
    }
    public void setPostId(Long postId) {
        this.postId = postId;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setContent(String title){
        this.content=content;
    }
}
