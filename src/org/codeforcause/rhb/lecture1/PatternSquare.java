package org.codeforcause.rhb.lecture1;

public class PatternSquare {
    public static void main(String[] args) {

        int n = 10;

        int row = 0;

        while (row < n){
            int col = 0;
            while (col < n){
                System.out.print("* ");
                col+=1;
            }
            System.out.println();
            row += 1;
        }
    }

    public void saySomething(){

    }
}
