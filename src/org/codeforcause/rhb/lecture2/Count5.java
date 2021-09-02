package org.codeforcause.rhb.lecture2;

public class Count5 {
    public static void main(String[] args) {
        int n = 15525;
        System.out.println(Count5.count5(n));
    }

    public static int count5(int source){
        int count = 0;
        while (source > 0){
            int rem = source % 10;
            source = source / 10;
            if(rem == 5){
                count++;
            }
        }
        return count;
    }
}
