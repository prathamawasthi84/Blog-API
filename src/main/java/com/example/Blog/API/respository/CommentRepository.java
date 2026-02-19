package com.example.Blog.API.respository;

import com.example.Blog.API.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
    List<CommentEntity> findByUser_Id(Long userId);
    List<CommentEntity> findByPost_PostId(Long postId);
}
