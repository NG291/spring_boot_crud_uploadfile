package com.demoChill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChillController {
    @GetMapping("/chill")
    public String chill() {
        return "index";
    }
}
