package com.example.Blog.API.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public Map<String,String>  exceptionHandling(ResourceNotFoundException ex){
    Map<String,String> error = new HashMap<>();
    error.put("message",ex.getMessage());
    error.put("status","404");
    error.put("timestamp", LocalDateTime.now().toString());
    return error;
    }
}
