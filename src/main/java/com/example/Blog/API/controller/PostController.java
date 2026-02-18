package com.example.Blog.API.controller;

import com.example.Blog.API.entity.PostEntity;
import com.example.Blog.API.respository.PostRepository;
import com.example.Blog.API.service.PostService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class PostController {
    private final PostService postService;
    public PostController(PostService postService){
        this.postService=postService;
    }
    @PostMapping("/{userId}/posts")
    public PostEntity addPost(@PathVariable Long userId,@Valid @RequestBody PostEntity postEntity){
        return postService.addPost(userId,postEntity);
    }
    @GetMapping("/{userId}/posts")
    public List<PostEntity> getByUserId(@PathVariable Long userId){
        return postService.getPostByUser(userId);
    }
    @GetMapping("/posts/{postId}")
        public PostEntity getByPostId(@PathVariable Long postId){
            return postService.getPostByPostId(postId);
        }
}
