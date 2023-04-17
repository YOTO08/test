package com.example.hellospring.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {

    @GetMapping("/")
    public String  home() {

        return "home";
    }

}

