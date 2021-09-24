package org.codeforcause.springdemo.models;

public class Human {

    private int id;
    private String name;
    private int age;

    private static int counter = 0;

    public Human(){
        this.id = Human.counter;
        Human.counter++;
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
