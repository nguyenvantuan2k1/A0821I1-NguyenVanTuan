package com.codegym.validateregister.controller;


import com.codegym.validateregister.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller

public class UserController {


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("User", new User());
        return "index";
    }

    @PostMapping("/validate")
    public ModelAndView Result(@Validated @ModelAttribute("User") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("index");
            return modelAndView;
        }
        model.addAttribute("User",user);
        ModelAndView modelAndView = new ModelAndView("result");
        return modelAndView;
    }
}
