package com.codegym.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/caculation")
    public String Caculation(@RequestParam String pt,@RequestParam("number1") double number1,@RequestParam("number2") double number2,Model model) {
        double rs=0;
        switch (pt) {
            case "+": rs = number1+number2;
            break;
            case "-": rs = number1-number2;
            break;
            case "*": rs = number1*number2;
            break;
            case "/": rs = number1/number2;
        }
        model.addAttribute("rs",rs);
        return "index";
    }
    @RequestMapping("/")
    public String Home() {
        return "index";
    }
//    @RequestMapping("/sub")
//    public String Sub(@RequestParam double number1,@RequestParam double number2, Model model) {
//        double rs= number1-number2;
//        model.addAttribute("rs",rs);
//        return "result";
//    }
//    @RequestMapping("/mul")
//    public String Mul(@RequestParam double number1,@RequestParam double number2, Model model) {
//        double rs= number1*number2;
//        model.addAttribute("rs",rs);
//        return "result";
//    }
//    @RequestMapping("/div")
//    public String Div(@RequestParam double number1,@RequestParam double number2, Model model) {
//        double rs= number1/number2;
//        model.addAttribute("rs",rs);
//        return "result";
//    }
}
