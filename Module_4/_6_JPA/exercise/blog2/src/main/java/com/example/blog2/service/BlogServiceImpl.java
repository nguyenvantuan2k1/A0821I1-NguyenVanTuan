package com.example.blog2.service;

import com.example.blog2.model.Blog;
import com.example.blog2.repository.IBlogRepository;
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
}
