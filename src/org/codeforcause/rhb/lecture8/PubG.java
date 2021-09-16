package org.codeforcause.rhb.lecture8;

import java.util.ArrayList;

public class PubG {
    public static void main(String[] args) {
        HumanPlayer p1 = new HumanPlayer("Ravi");
        ShooterPlayer p2 = new ShooterPlayer("Hema");
        HumanPlayer p3 = new ShooterPlayer("Navya");

        p2.kill(p3);

//        System.out.println(p1.toString());

        System.out.println(HumanPlayer.getPopulation());
    }
}

class HumanPlayer {
    protected String name;
    protected boolean alive;
    private static ArrayList<HumanPlayer> population = new ArrayList<>();

    public HumanPlayer(String name){
        this.name = name;
        this.alive = true;
        HumanPlayer.population.add(this);
    }

    public String getName(){
        return this.name;
    }

    public static ArrayList<HumanPlayer> getPopulation(){
        return HumanPlayer.population;
    }

    @Override
    public String toString() {
        return "{ " + this.name + " : " + this.alive + " }";
    }

}

class ShooterPlayer extends HumanPlayer {

    private int kills;

    public ShooterPlayer(String name) {
        super(name);
        this.kills = 0;
    }

    public void kill(HumanPlayer target){
        if(this == target){
            System.out.println("Suicide is never an option");
            return;
        }

        if(target instanceof ShooterPlayer){
            System.out.println("You can not kill a shooter");
            return;
        }

        if(target.alive){
            target.alive = false;
            this.kills += 1;
        }

    }

    @Override
    public String toString() {
        return "{ " + this.name + " : " + this.alive + " : " + this.kills+ " }";
    }

}
