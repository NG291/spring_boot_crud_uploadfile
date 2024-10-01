package com.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class springController {
    @GetMapping("/hello")
    public String hello(){
        return "index";
    }
}
