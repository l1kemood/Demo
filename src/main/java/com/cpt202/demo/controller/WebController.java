package com.cpt202.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {

    @Controller
    public class ManagementController {
    
    @GetMapping("/Admin/login")
    public String pageAdminlogiString() {
        // Logic to populate model data (if needed)
        return "adminlogin";// Thymeleaf template name (adminlogin)
    }
    @GetMapping("/manager/new")
    public String pageAdminmain() {
        // Logic to populate model data (if needed)
        return "newManager";// Thymeleaf template name (MGmain)

    } 
}
} 
  
