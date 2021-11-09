package com.company;

public class Human {
    private int age;
    private String name;
    private boolean alive = true;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        Earth.getInstance().birth(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void die(){
        this.alive = false;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", alive='" + alive + '\'' +
                '}';
    }
}
