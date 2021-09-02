package org.codeforcause.rhb.lecture1;

public class Prime {
    public static void main(String[] args) {
        int n = 7;

        boolean isPrime = true;
        int counter = 2;

        while (counter*counter <= n){
            if((n % counter) == 0){
                isPrime = false;
                break;
            }
            counter++;
        }

        if(isPrime){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
