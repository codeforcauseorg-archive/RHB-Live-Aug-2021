package org.codeforcause.rhb.lecture7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class SubSeq {

    public static void main(String[] args) {

        String line = "aabc";
        System.out.println(SubSeq.generateSubSeq(line));

    }

    public static ArrayList<String> generate(String unproc, String proc){
        if(unproc.length() == 0){
            ArrayList<String> env = new ArrayList<>();
            env.add(proc);
            return env;
        }

        char ch = unproc.charAt(0);
        ArrayList<String> left = SubSeq.generate(unproc.substring(1), proc + ch);
        ArrayList<String> right = SubSeq.generate(unproc.substring(1), proc);

        ArrayList<String> total = new ArrayList<>();
        total.addAll(left);
        total.addAll(right);
        return total;
    }

    public static ArrayList<String> generateSubSeq(String line){
        HashSet<String> results = new HashSet<>();
        SubSeq.generateSimple(line, "", results);
        ArrayList<String> response = new ArrayList<>();
        response.addAll(results);
        return response;
    }

    public static void generateSimple(String unproc, String proc, HashSet<String> result){
        if(unproc.length() == 0){
            if(proc.length() > 0){
                result.add(proc);
            }
            return;
        }

        char ch = unproc.charAt(0);
        SubSeq.generateSimple(unproc.substring(1), proc + ch, result);
        SubSeq.generateSimple(unproc.substring(1), proc, result);

        return;
    }
}
