package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    private final Service service;
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/emp/end")
    public String showTherd() {
        return "employee/therd";
    }
    
    @GetMapping("/emp/end")
    public String show6th() {
        return "employee/therd";
    }


}
