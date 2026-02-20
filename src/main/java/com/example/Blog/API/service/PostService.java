package com.example.Blog.API.service;

import com.example.Blog.API.entity.PostEntity;
import com.example.Blog.API.entity.UserEntity;
import com.example.Blog.API.exception.ResourceNotFoundException;
import com.example.Blog.API.respository.PostRepository;
import com.example.Blog.API.respository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public PostService(PostRepository postRepository,UserRepository userRepository){
        this.postRepository=postRepository;
        this.userRepository=userRepository;
    }
    public PostEntity addPost(Long userId, PostEntity postEntity) {

        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id" + userId));

        postEntity.setUser(user);

        return postRepository.save(postEntity);
    }

    public List<PostEntity> getPostByUser(Long userId){
        return postRepository.findByUser_Id(userId);
    }
    public PostEntity getPostByPostId(Long postId){
        return postRepository.findById(postId).orElseThrow(()-> new RuntimeException("Post not found"));
    }
}
