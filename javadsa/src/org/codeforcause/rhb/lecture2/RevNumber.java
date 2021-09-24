package org.codeforcause.rhb.lecture2;

import java.util.Scanner;

public class RevNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(RevNumber.revnum(num));
    }

    public static int revnum(int source){
        int target = 0;

        while (source > 0){
            int rem = source % 10;
            source = source / 10;

            target = ((target * 10) + rem);
        }

        return target;
    }
}
