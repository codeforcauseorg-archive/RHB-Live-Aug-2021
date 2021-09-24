package org.codeforcause.rhb.lecture10.generic;

import java.util.ArrayList;

public class Baloons<T extends Comparable>{

    public ArrayList<T> baloons = new ArrayList<>();


}

class Driver{
    public static void main(String[] args) {
        Baloons<Integer> balls = new Baloons<>();
    }
}
