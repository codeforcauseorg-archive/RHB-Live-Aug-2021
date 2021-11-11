package com.example.simpleaopdemo.controllers;

import com.example.simpleaopdemo.aspects.Interceptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    @Interceptor(roles = {"admin"})
    public String baseLoc(){
        System.out.println("In between");
        return "This is base location";
    }


    @GetMapping("/error")
    @Interceptor(roles = {"admin", "user"})
    public String throwAnException() throws Exception {
        throw new Exception("Hello from exception!");
    }
}
