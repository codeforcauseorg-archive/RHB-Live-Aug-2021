package org.codeforcause.rhb.lecture10;

public class Exec {
    public static void main(String[] args) {
        Maruti mycar = new Maruti();
        mycar.start();
        mycar.stop();

        NitroEngine nitro = new NitroEngine();
        mycar.changeEngine(nitro);

        mycar.start();
        mycar.stop();
    }
}
