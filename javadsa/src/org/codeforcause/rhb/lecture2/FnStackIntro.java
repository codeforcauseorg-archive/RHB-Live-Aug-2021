package org.codeforcause.rhb.lecture2;

public class FnStackIntro {
    public static void main(String[] args) {
        FnStackIntro.sayHello("Anuj");
    }

    public static void sayHello(String name){

        System.out.println("Hello "+ name);

        {
          int a = 10;
          System.out.println(a);
        }

        System.out.println("hey");
    }
}
