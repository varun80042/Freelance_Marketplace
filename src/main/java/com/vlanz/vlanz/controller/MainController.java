package com.vlanz.vlanz.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @GetMapping("/")
    public String home() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName();
        
        if (email.endsWith("@freelancer.com")) {
            return "freelancer"; 
        } 
        else if (email.endsWith("@customer.com")) {
            return "customer"; 
        } 

		else {
            return "unknown";
        }
    }
}
