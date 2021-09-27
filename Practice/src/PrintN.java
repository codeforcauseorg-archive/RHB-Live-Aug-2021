

import java.util.Scanner;

public class PrintN {

    // Recursive Function
    public static void func(int n){

        if( n==1){
            System.out.println(1);
            return;
        }

        //System.out.println("resursive function called for n equals to " + n);
        func(n-1);
        //System.out.println("resursive function ended for n equals to " + n);

        System.out.println(n);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        func(n);






    }
}
