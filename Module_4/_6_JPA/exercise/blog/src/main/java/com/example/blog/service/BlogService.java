package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    void save(Blog blog);
    Blog findById(int id);
    void delete(Blog blog);
}
