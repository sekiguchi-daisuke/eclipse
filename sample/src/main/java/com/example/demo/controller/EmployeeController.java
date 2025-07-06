package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

//    private final Service service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/emp/start")
    public String showSearch() {
        return "employee/search";
    }

    /**
     * コメントの追加
     * @return
     */
    @GetMapping("/emp/end")
    public String showSecond() {
        return "employee/end2";
    }

    //【指摘】Javadocをつけましょう。
    @GetMapping("/emp/end")
    public String showTherd() {
        return "employee/therd";
    }

    //【指摘】Javadocをつけましょう。
    @GetMapping("/emp/end")
    public String show6th() {
        return "employee/therd";
    }

<<<<<<< HEAD
    //【指摘】Javadocをつけましょう。
    @GetMapping("/emp/end")
    public String show7th() {
        //【指摘】不要なコードは消しましょう。
        return "employee/therd";
    }
=======

>>>>>>> branch 'review' of https://github.com/sekiguchi-daisuke/eclipse.git
}
