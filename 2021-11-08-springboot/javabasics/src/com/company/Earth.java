package com.company;

import java.util.ArrayList;

public class Earth {

    private static Earth instance = null;

    private int population;
    private ArrayList<Human> people;

    private Earth(){
        this.population = 0;
        this.people = new ArrayList<>();
    }

    public void birth(Human human){
        this.population += 1;
        this.people.add(human);
    }

    public void death(){
        this.population -= 1;
    }

    public static Earth getInstance(){
        if(Earth.instance == null){
            Earth.instance = new Earth();
        }

        return Earth.instance;
    }

    public int getPopulation() {
        return population;
    }

    public ArrayList<Human> getPeople() {
        return people;
    }
}
