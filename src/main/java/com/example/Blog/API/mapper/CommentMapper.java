package com.example.Blog.API.mapper;

import com.example.Blog.API.dto.CommentDTO;
import com.example.Blog.API.entity.CommentEntity;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper {
    public CommentEntity toComment(CommentDTO commentDTO){
        CommentEntity comment= new CommentEntity();
        comment.setCommentId(commentDTO.getCommentId());
        comment.setContent(commentDTO.getContent());
        return comment;
    }
    public CommentDTO toResponse(CommentEntity comment){
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setCommentId(comment.getCommentId());
        commentDTO.setContent(comment.getContent());
        commentDTO.setCreatedAt(comment.getCreatedAt());
        if(comment.getUser()!=null){
            commentDTO.setUserId(comment.getUser().getId());
        }
        if(comment.getPost()!=null){
            commentDTO.setPostId(comment.getPost().getPostId());
        }
        return commentDTO;
    }
}
