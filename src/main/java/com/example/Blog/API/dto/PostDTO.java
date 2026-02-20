package com.example.Blog.API.dto;

import jakarta.validation.constraints.NotBlank;

public class PostDTO {
    private Long postId;
    @NotBlank
    private String title;
    @NotBlank
    private String content;
    private Long userId;

    public PostDTO(){
    }
    public PostDTO(Long userId,Long postId,String title,String content){
        this.userId=userId;
        this.postId=postId;
        this.content=content;
        this.title=title;
    }
    //Getters
    public Long getUserId() {
        return userId;
    }
    public Long getPostId() {
        return postId;
    }
    public String getContent() {
        return content;
    }
    public String getTitle() {
        return title;
    }
    //Setters
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setPostId(Long postId) {
        this.postId = postId;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
