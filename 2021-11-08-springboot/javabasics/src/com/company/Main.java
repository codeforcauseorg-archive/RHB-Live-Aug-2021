package com.company;

public class Main {

    public static void main(String[] args) {
	    Human ravi = new Human(22, "Ravi");
	    Human shubham = new Human(29, "Shubham");

	    ravi.die();

        System.out.println(Earth.getInstance().getPeople());
    }
}
