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

    /**
     * コメントの追加
     *
     * @return
     */
    @GetMapping("/emp/end")
    public String showSecond() {
        return "employee/end2";
    }

    /**
     *
     * @return
     */
    @GetMapping("/emp/end")
    public String showTherd() {
        return "employee/therd";
    }

    /**
     * 【指摘】ここにコメントを追加しましょう。
     *
     * @return
     */
    @GetMapping("/emp/end")
    public String show4th() {
        return "employee/4th";
    }

    /**
     * 【指摘】ここにコメントを追加しましょう。
     *
     * @return
     */
    //【指摘】不要なコメントは消しましょう。
    // @GetMapping("/emp/end")
    // public String show5th() {
    // return "employee/5th";
    // }
}
