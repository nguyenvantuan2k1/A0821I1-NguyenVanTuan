package com.codegym.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/save")
    public String save(@RequestParam(name="spice") String[] condiment, Model model) {
//        for(int i=0;i<condiment.length;i++) {
//            System.out.println(condiment[i]);
//        }
        model.addAttribute("condiment",condiment);
        return "result";
    }
}
