package org.codeforcause.springdemo.services;

import org.codeforcause.springdemo.dtos.UpdateHumanDTO;
import org.codeforcause.springdemo.models.Human;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class HumanService {

    private ArrayList<Human> people = new ArrayList<>();

    public ArrayList<Human> fetchPeople(){
        return this.people;
    }

    public Human addHuman(@RequestBody Human human){
        this.people.add(human);
        return human;
    }

    public Human fetchHuman(int id){
        for (int i = 0; i < this.people.size(); i++) {
            if(this.people.get(i).getId() == id){
                return this.people.get(i);
            }
        }

        return null;
    }

    public Human deleteHuman(int id){
        for (int i = 0; i < this.people.size(); i++) {
            if(this.people.get(i).getId() == id){
                return this.people.remove(i);
            }
        }
        return null;
    }

    public Human updateHuman(@PathVariable int id, @RequestBody UpdateHumanDTO humanInfo){

        for (int i = 0; i < this.people.size(); i++) {
            if(this.people.get(i).getId() == id){
                Human human = this.people.get(i);
                human.setName(humanInfo.getName());
                human.setAge(humanInfo.getAge());
                return human;
            }
        }

        return null;
    }

}
