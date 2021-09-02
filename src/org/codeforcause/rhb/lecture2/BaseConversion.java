package org.codeforcause.rhb.lecture2;

public class BaseConversion {

    public static void main(String[] args) {
        System.out.println(BaseConversion.dec2any(10, 6));
    }

    public static int dec2bin(int dec) {
        int bin = 0;
        int place = 1;
        while (dec > 0){
            int rem = dec % 2;
            dec = dec / 2;
            bin = (rem * place) + bin;
            place = place * 10;
        }

        return bin;
    }

    public static int dec2any(int dec, int base) {
        int bin = 0;
        int place = 1;
        while (dec > 0){
            int rem = dec % base;
            dec = dec / base;
            bin = (rem * place) + bin;
            place = place * 10;
        }

        return bin;
    }
}
