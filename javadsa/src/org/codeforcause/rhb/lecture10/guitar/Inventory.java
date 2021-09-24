package org.codeforcause.rhb.lecture10.guitar;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Guitar> guitars = new ArrayList<>();

    public void addGuitar(Guitar guitar){
        this.guitars.add(guitar);
    }


}
