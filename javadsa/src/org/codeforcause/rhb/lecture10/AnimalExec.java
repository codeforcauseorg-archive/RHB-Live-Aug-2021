package org.codeforcause.rhb.lecture10;

public class AnimalExec {

    public static void main(String[] args) {
        Human bingo = new Human();
        Dog doggo = new Dog();

        bingo.speak();
        doggo.speak();
    }

}

abstract class Animal {
    public abstract void speak();
}

class Human extends Animal {

    @Override
    public void speak() {
        System.out.println("Hello, how do you do");
    }
}

class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("bhaw bhaw");
    }
}
