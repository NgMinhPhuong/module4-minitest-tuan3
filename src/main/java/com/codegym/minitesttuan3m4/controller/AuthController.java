package com.codegym.minitesttuan3m4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping
    public String no(){
        return "redirect:/home";
    }
    @GetMapping("/login")
    public String login(){
        return "/login";
    }

    @GetMapping("/home")
    public String home(){
        return "/home";
    }
}
