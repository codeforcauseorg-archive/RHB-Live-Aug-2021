package org.codeforcause.rhb.lecture6;

import java.util.ArrayList;

public class Permute {

    public static void main(String[] args) {
        String line = "abc";
        Permute.generate("", line);


    }

    public static void generate(String proc, String unproc){
        if(unproc.length() == 0){
            System.out.println(proc);
            return;
        }

        for (int i = 0; i < unproc.length(); i++) {
            char ch = unproc.charAt(i);
            Permute.generate(proc + ch,  unproc.substring(0, i) + unproc.substring(i+1));
        }
    }
}
