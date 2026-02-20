package com.example.Blog.API.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class CommentDTO {
    private Long commentId;
    private Long postId;
    private Long userId;
    @NotBlank
    private String content;
    private LocalDateTime createdAt;
    public CommentDTO(){

    }
    public CommentDTO(Long commentId,Long postId,Long userId,String content,LocalDateTime createdAt){
        this.commentId=commentId;
        this.content=content;
        this.createdAt=createdAt;
        this.userId=userId;
        this.postId=postId;
    }
    //Getters
    public Long getPostId() {
        return postId;
    }
    public Long getUserId() {
        return userId;
    }
    public Long getCommentId() {
        return commentId;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public String getContent() {
        return content;
    }
    //Setters
    public void setPostId(Long postId) {
        this.postId = postId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
    public void setContent(String content) {
        this.content=content;
    }
}
