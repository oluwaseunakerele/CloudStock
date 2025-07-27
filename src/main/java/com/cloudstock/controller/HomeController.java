package com.cloudstock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String homePage() {
        return "home";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        // ✅ Hardcoded credentials
        if (username.equals("Seun") && password.equals("Samopel")) {
            return "redirect:/items";
        } else {
            // ✅ Redirect with custom error parameter
            return "redirect:/?error=Invalid username or password!";
        }
    }
}
