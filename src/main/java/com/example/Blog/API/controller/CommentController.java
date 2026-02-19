package com.example.Blog.API.controller;

import com.example.Blog.API.entity.CommentEntity;
import com.example.Blog.API.service.CommentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService=commentService;
    }
    @PostMapping("/users/{userId}/posts/{postId}/comments")
    public CommentEntity addComment(@PathVariable Long userId , @PathVariable Long postId,@RequestBody CommentEntity comment){
        return commentService.addComment(userId,postId,comment);
    }
    @GetMapping("/{postId}/comments")
        public List<CommentEntity > getCommentByPost(@PathVariable Long postId){
               return commentService.getCommentByPost(postId);
        }
}
