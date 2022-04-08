package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import java.nio.file.Path;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ServletContext application;
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
    public String PostingPage(@ModelAttribute("Blog") Blog blog, BindingResult result,Model model) {
//        System.out.println(file.toString());
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

        if(result.hasFieldErrors()){
            model.addAttribute(blog);
        }
            blogService.save(blog);
        return "redirect:";
    }
//    @GetMapping("/edit/{id}")
//    public String editPost(@PathVariable int id){
//        Blog blogedit=blogService.findById(id);
//        return "redirect:";
//    }
    @RequestMapping("/delete_blog/{id}")
    public String deletePost(@PathVariable int id){
        System.out.println(id);
        blogService.delete(blogService.findById(id));
        return "redirect:";
    }
}
