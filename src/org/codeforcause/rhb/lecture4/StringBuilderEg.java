package org.codeforcause.rhb.lecture4;

import java.util.ArrayList;

public class StringBuilderEg {
    public static void main(String[] args) {
//        String a = "Anuj";
//        String b = "Anuj";

        ArrayList<Integer> alist = new ArrayList<>();

        System.out.println(alist.size());

        for (int i = 0; i < 12; i++) {
            System.out.println(alist.add(i));
        }

        System.out.println(alist.size());


        StringBuilder sb = new StringBuilder("a");


//        System.out.println(a == b);
    }
}
