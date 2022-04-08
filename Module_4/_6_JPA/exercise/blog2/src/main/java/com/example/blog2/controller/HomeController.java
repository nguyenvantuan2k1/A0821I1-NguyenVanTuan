package com.example.blog2.controller;

import com.example.blog2.model.Blog;
import com.example.blog2.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
//    @Autowired
//    ServletContext application;
    @Autowired
    BlogService blogService;
    @ModelAttribute("blogs")
    public List<Blog> getBlogs(){
        return blogService.findAll();
    }
    @GetMapping("")
    public ModelAndView HomePage() {
        return new ModelAndView("views/home","Blog",new Blog());
    }

    @PostMapping("/postting")
    public String PostingPage(@ModelAttribute("Blog") Blog blog) {

//        if(!blog.getImgFile().isEmpty()){
//            String path = application.getRealPath("/");
//            System.out.println("path :" + path);
//            try {
//                blog.setImgUrl(blog.getImgFile().getOriginalFilename());
//                String filePath = path + "/images" + blog.getImgUrl();
//                blog.getImgFile().transferTo(Path.of(filePath));
//                blog.setImgFile(null);
//                blog.setImgUrl(filePath);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        System.out.println("url:"+blog.getImgUrl());
        return "views/index";
    }
}
