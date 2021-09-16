package org.codeforcause.rhb.lecture9;

import java.util.LinkedList;

public class CustomQueue {
    private LinkedList<Integer> data = new LinkedList<>();

    public void insert(int value){
        this.data.addLast(value);
    }

    public int remove(){
        return this.data.removeFirst();
    }

    public int first(){
        return this.data.get(0);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }
}
