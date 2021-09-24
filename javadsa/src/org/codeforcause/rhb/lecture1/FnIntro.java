package org.codeforcause.rhb.lecture1;

public class FnIntro {
    public static void main(String[] args) {
        FnIntro.downTriangle(10);
    }

    public static void upTriangle(int n){
        int row = 0;

        while (row < n){
            int col = 0;
            while (col <= row){
                System.out.print("* ");
                col+=1;
            }
            System.out.println();
            row += 1;
        }
    }

    public static void downTriangle(int n){
        int row = 0;

        while (row < n){
            int col = 0;
            while (col < n - row){
                System.out.print("* ");
                col+=1;
            }
            System.out.println();
            row += 1;
        }
    }


}
