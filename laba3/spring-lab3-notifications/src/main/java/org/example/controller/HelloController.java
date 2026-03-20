package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hey, Spring Boot!";
    }

    @GetMapping("/goodbye")
    public String sayBye() {
        return "Bye, Spring Boot!";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Wassup, " + name + "!";
    }

    @GetMapping("/info")
    public String getUserInfo(@RequestParam String name, @RequestParam int age) {
        return "User " + name + " is " + age + " years old.";
    }
}