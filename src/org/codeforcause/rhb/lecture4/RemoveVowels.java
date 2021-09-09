package org.codeforcause.rhb.lecture4;

import java.util.*;

public class RemoveVowels {
    public static void main(String[] args) {
        String line = "We are so happy.";
        String result = RemoveVowels.remove(line);
        System.out.println(result);
    }

    public static String remove(String line){

        StringBuilder sb = new StringBuilder();

        HashSet<Character> vowels = new HashSet<>();

        String vows = "aeiouAEIOU";
        for (int i = 0; i < vows.length(); i++) {
            vowels.add(vows.charAt(i));
        }

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(!vowels.contains(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();

    }
}
