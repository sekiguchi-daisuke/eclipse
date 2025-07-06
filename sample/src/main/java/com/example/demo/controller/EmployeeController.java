package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/emp/start")
    public String showSearch() {
        return "employee/search";
    }

      @GetMapping("/emp/end")
    public String showSecond() {
        return "employee/end2";
    }

    @GetMapping("/emp/end")
    public String showTherd() {
        return "employee/therd";
    }

    @GetMapping("/emp/end")
    public String show4th() {
        return "employee/4th";
    }

        @GetMapping("/emp/end")
    public String show5th() {
        return "employee/5th";
    }
}
