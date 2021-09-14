package org.codeforcause.rhb.lecture8;

public class Exec {
    public static void main(String[] args) {
//        Human hema = new Human("Hema");
//
//        System.out.println(Human.population);
//        Human navya = new Human("Navya");
//
//        System.out.println(Human.population);
//
//        hema.party();
//        hema.party();
//        hema.party();
//        hema.party();
//        hema.party();
//        hema.party();
//        hema.party();
//
//        hema.loan(navya);
//
//        System.out.println(hema.getMoney());
//        System.out.println(navya.getMoney());
//
//        hema.party();
//        hema.party();

        Earth e1 = Earth.getInstance();
        Earth e2 = Earth.getInstance();

        e1.createMall();
        e2.createMall();

        System.out.println(e1 == e2);

        System.out.println(e1.getForests());
        System.out.println(e2.getForests());
    }
}
