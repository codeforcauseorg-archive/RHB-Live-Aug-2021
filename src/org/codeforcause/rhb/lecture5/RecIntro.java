package org.codeforcause.rhb.lecture5;

public class RecIntro {

    public static void main(String[] args) {
        RecIntro.pd(5);
    }

    public static void pd(int n){
        if(n == 0){
            return;
        }

        RecIntro.pd(n-1);
        System.out.println(n);
    }

    public static void pd5(){
        System.out.println(5);
        RecIntro.pd4();
    }

    public static void pd4(){
        System.out.println(4);
        RecIntro.pd3();
    }

    public static void pd3(){
        System.out.println(3);
        RecIntro.pd2();
    }

    public static void pd2(){
        System.out.println(2);
        RecIntro.pd1();
    }

    public static void pd1(){
        System.out.println(1);
        RecIntro.pd0();
    }

    public static void pd0(){
        return;
    }
}
