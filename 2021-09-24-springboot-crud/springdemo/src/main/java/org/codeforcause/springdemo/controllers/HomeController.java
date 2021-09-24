package org.codeforcause.springdemo.controllers;

import org.codeforcause.springdemo.dtos.UpdateHumanDTO;
import org.codeforcause.springdemo.models.Human;
import org.codeforcause.springdemo.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
public class HomeController {

    @Autowired
    private HumanService humanService;

    @GetMapping("/{id}")
    public Human fetchHuman(@PathVariable int id){
        return this.humanService.fetchHuman(id);
    }

    @GetMapping("/")
    public ArrayList<Human> fetchPeople(){
        return this.humanService.fetchPeople();
    }

    @PostMapping("/")
    public Human addHuman(@RequestBody Human human){
        this.humanService.addHuman(human);
        return human;
    }

    @DeleteMapping("/{id}")
    public Human deleteHuman(@PathVariable int id){
        return this.humanService.deleteHuman(id);
    }


    @PutMapping("/{id}")
    public Human updateHuman(@PathVariable int id, @RequestBody UpdateHumanDTO humanInfo){
        return this.humanService.updateHuman(id, humanInfo);
    }


}
