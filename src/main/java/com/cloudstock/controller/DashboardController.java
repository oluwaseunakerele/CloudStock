package com.cloudstock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboardPage() {
        return "dashboard"; // maps to dashboard.html
    }
}
