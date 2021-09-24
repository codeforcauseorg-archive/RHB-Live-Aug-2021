package org.codeforcause.rhb.lecture8;

public class Earth {

    private static Earth instance;

    private int forests = 100;

    private Earth(){

    }

    public static Earth getInstance(){
        if(Earth.instance == null){
            Earth.instance = new Earth();
        }
        return Earth.instance;
    }

    public void createMall(){
        this.forests -= 1;
    }

    public int getForests() {
        return forests;
    }
}
