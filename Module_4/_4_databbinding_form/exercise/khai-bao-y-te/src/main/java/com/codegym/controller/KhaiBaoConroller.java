package com.codegym.controller;

import com.codegym.model.Declaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KhaiBaoConroller {
    @GetMapping("")
    public ModelAndView Home(){
        return new ModelAndView("tokhai","declaration",new Declaration());
    }

    @PostMapping("/send")
    public String saveProduct(@ModelAttribute Declaration declaration, Model model) {
        if (declaration != null) {
            model.addAttribute("declaration",declaration);
        }
        return "result";
    }




}
