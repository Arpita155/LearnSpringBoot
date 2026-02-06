package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    // PathVariable
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello "+name +" welcome to spring boot";
    }

    @GetMapping("/square/{num}")
    public int Square(@PathVariable int num){
        return num*num;
    }

    // @RequestParam (Query parameters)
    @GetMapping("/greet")
    public String greet(@RequestParam String name){
        return "Good Morning"+ name;
    }

    @GetMapping("/sum")
    public String sum(@RequestParam int a, @RequestParam int b){
        int sum =  a+b;
        return "Sum = "+sum;
    }

    // Optional RequestParam
    @GetMapping("/Welcome")
    public String Welcome(@RequestParam(defaultValue = "Guest") String name){
        return "Welcome "+name;
    }

}
