package org.codeforcause.rhb.lecture9;

import java.util.ArrayList;

public class CustomStack {

    private ArrayList<Integer> data = new ArrayList<>();

    public void push(int value){
        this.data.add(value);
    }

    public int pop(){
        return this.data.remove(data.size()-1);
    }

    public int top(){
        return this.data.get(data.size()-1);
    }

    public boolean empty(){
        return this.data.size() == 0;
    }

}
