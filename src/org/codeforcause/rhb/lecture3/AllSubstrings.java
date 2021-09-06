package org.codeforcause.rhb.lecture3;

public class AllSubstrings {
    public static void main(String[] args) {
        String data = "abc";
        AllSubstrings.printAllSS(data);

    }

    public static void printAllSS(String line){
        for (int i = 0; i < line.length(); i++) {
            for (int j = i+1; j <= line.length(); j++) {
                System.out.println(line.substring(i, j));
            }
        }
    }
}
