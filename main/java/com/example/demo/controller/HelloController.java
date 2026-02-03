package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Arpita, welcome to Spring Boot 🚀";
    }

    @GetMapping("/bye")
    public String bye(){
        return "Bye Arpita";
    }

    @GetMapping("/info")
    public String ifo(){
        return "I am Arpita and i am learning spring boot";
    }
}
