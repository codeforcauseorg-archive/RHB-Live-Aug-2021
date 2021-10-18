package com.example.authdemo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HomeController {

    @GetMapping("/")
    public String hello(){
        System.out.println("We reached here");
        return "Hello from Code for Cause";
    }
}
