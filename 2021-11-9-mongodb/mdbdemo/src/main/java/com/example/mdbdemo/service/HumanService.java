package com.example.mdbdemo.service;

import com.example.mdbdemo.model.Human;
import com.example.mdbdemo.repos.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HumanService {

    @Autowired
    private HumanRepository humanRepository;

    public Human addHuman(Human human){
        return this.humanRepository.save(human);
    }

    public List<Human> findAll(){
        return this.humanRepository.findAll();
    }

    public Optional<Human> findHumanById(String id){
        return this.humanRepository.findById(id);
    }


}
