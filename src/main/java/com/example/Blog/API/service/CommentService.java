package com.example.Blog.API.service;

import com.example.Blog.API.entity.CommentEntity;
import com.example.Blog.API.entity.PostEntity;
import com.example.Blog.API.entity.UserEntity;
import com.example.Blog.API.respository.CommentRepository;
import com.example.Blog.API.respository.PostRepository;
import com.example.Blog.API.respository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public CommentService(CommentRepository commentRepository,PostRepository postRepository,UserRepository userRepository){
        this.commentRepository=commentRepository;
        this.postRepository=postRepository;
        this.userRepository=userRepository;
    }
    public CommentEntity addComment(Long userId, Long postId,CommentEntity commentEntity){
        UserEntity user = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User not found"));
        PostEntity post = postRepository.findById(postId).orElseThrow(()-> new RuntimeException("Post not found"));

        commentEntity.setUser(user);
        commentEntity.setPost(post);

        return commentRepository.save(commentEntity);
    }
    public List<CommentEntity> getCommentByPost(Long postId){
        PostEntity post = postRepository.findById(postId).orElseThrow(()-> new RuntimeException("Post not found"));
        return commentRepository.findByPost_PostId(post.getPostId());
    }
}
