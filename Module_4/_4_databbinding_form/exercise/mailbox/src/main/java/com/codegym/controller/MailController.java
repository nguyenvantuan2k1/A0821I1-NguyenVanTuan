package com.codegym.controller;

import com.codegym.model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {
    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("setting", "mail", new Mail());
        return modelAndView;
    }
    @PostMapping("/setting")
    public ModelAndView login(@ModelAttribute("mail") Mail mail){
            ModelAndView modelAndView = new ModelAndView("result");
            modelAndView.addObject("mail", mail);
            return modelAndView;
        }
}
