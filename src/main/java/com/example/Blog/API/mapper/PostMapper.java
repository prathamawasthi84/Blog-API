package com.example.Blog.API.mapper;

import com.example.Blog.API.dto.PostDTO;
import com.example.Blog.API.entity.PostEntity;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {
    public PostEntity toPost(PostDTO postDTO){
        PostEntity post = new PostEntity();
        post.setPostId(postDTO.getPostId());
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());
        return post;
    }
    public PostDTO toResponse(PostEntity post){
        PostDTO postDTO= new PostDTO();
        postDTO.setPostId(post.getPostId());
        postDTO.setTitle(post.getTitle());
        postDTO.setContent(post.getContent());
        if(post.getUser()!=null){
            postDTO.setUserId(post.getUser().getId());
        }
        return postDTO;
    }
}
