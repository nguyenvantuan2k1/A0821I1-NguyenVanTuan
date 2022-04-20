package com.codegym.shopproject.controller;

import com.codegym.shopproject.model.Cart;
import com.codegym.shopproject.model.Product;
import com.codegym.shopproject.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class HomeController {
    @Autowired
    IProductService productService;
    @GetMapping("/home")
    public ModelAndView HomePage(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }
    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/detail/{id}")
    public String detailProduct(@PathVariable Long id, Model model){
        model.addAttribute("product",productService.getProductById(id));
        model.addAttribute("products", productService.findAll());
        return "detail";
    }
    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("list")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/home";
    }

}
