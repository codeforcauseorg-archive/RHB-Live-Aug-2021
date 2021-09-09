package org.codeforcause.rhb.lecture5;

public class Fibo {

    public static void main(String[] args) {
        System.out.println(Fibo.fibo(8));
    }

    public static int fibo(int n){

        if(n < 2) {
            return n;
        }

        int first = Fibo.fibo(n-1);
        int second = Fibo.fibo(n-2);

        return first + second;

    }
}
