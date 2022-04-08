package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private IBlogRepository iblogRepository;

    @Override
    public List<Blog> findAll() {
        return iblogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        iblogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return iblogRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Blog blog) {
        iblogRepository.delete(blog);
    }
}
