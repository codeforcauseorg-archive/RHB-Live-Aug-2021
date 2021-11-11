package com.example.mdbdemo.controllers;

import com.example.mdbdemo.model.Human;
import com.example.mdbdemo.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class HumanController {

    @Autowired
    private HumanService humanService;

    @PostMapping
    public Human addHuman(@RequestBody Human human){
        return this.humanService.addHuman(human);
    }

    @GetMapping
    public List<Human> findAll(){

        return this.humanService.findAll();
    }

}
