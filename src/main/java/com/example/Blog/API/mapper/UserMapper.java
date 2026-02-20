package com.example.Blog.API.mapper;

import com.example.Blog.API.dto.UserDTO;
import com.example.Blog.API.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserEntity toUser(UserDTO userDTO){
        UserEntity user = new UserEntity();
        user.setUserEmail(userDTO.getUserEmail());
        user.setUsername(userDTO.getUserName());
        return user;
    }
    public UserDTO toResponse(UserEntity user){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getId());
        userDTO.setUserName(user.getUsername());
        userDTO.setUserEmail(user.getUserEmail());
        return userDTO;
    }
}
