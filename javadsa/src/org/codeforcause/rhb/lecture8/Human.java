package org.codeforcause.rhb.lecture8;

public class Human {

    private String name;
    private int money;

    public static int population = 0;

    public Human(String name){
        this.name = name;
        this.money = 1000;

        Human.population += 1;
    }

    public void party(){
        if(this.money >= 200){
            System.out.println(this.name+ " party like dam dam");
            this.money -= 200;
        } else {
            System.out.println("Not enough money");
        }
    }

    public void loan(Human friend){
        if(friend.money > 500){
            friend.money -= 500;
            this.money += 500;
        }
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public static int getPopulation() {
        return population;
    }
}
