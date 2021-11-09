package com.example.simplesb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Whatever {

    @Autowired
    private ServeMe serveMe;

    @GetMapping
    public String hello(){
        return "" +this.serveMe.serve();
    }
}
