package com.example.Blog.API.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;
    @NotBlank
    private String content;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "post_Id")
    private PostEntity post;
    @ManyToOne
    @JoinColumn(name = "user_Id")
    private UserEntity user;

    public CommentEntity (){

    }
    public CommentEntity(Long commentId,String content,LocalDateTime createdAt){
        this.commentId=commentId;
        this.content=content;
        this.createdAt=createdAt;
    }
    //Getters
    public UserEntity getUser() {
        return user;
    }
    public PostEntity getPost() {
        return post;
    }
    public Long getCommentId() {
        return commentId;
    }
    public String getContent() {
        return content;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    //Setters

    public void setUser(UserEntity user) {
        this.user = user;
    }
    public void setPost(PostEntity post) {
        this.post = post;
    }
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
