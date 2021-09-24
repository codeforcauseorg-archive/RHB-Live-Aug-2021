package org.codeforcause.rhb.lecture6;

import java.util.Scanner;

public class SubSeq {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String unproc = scn.nextLine();
        SubSeq.generate(unproc, "");
    }

    public static void generate(String unproc, String proc){
        if(unproc.length() == 0){
            System.out.println(proc);
            return;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        SubSeq.generate(unproc, proc + ch);
        SubSeq.generate(unproc, proc);

    }




}
