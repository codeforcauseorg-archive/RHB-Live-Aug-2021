package org.codeforcause.rhb.lecture5;

import java.math.BigInteger;

public class Power {

    public static void main(String[] args) {
        System.out.println(Power.power(10, 100000));
    }

    public static BigInteger power(int x, int y){
        // x and y both int
        // y is >= 0

        if(y == 0){
            return BigInteger.ONE;
        }

        int half = y / 2;
        BigInteger powerHalf = Power.power(x, half);
        BigInteger result = powerHalf.multiply(powerHalf);
        if(y%2 != 0){
            result = result.multiply(new BigInteger(""+x));
        }

        return result;

    }
}
