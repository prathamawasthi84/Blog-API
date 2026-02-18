package com.example.Blog.API.respository;

import com.example.Blog.API.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<PostEntity,Long> {
List<PostEntity> findByUser_Id(Long userId);
PostEntity findByPostId(Long postId);
}
