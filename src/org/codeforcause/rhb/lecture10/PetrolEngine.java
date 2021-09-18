package org.codeforcause.rhb.lecture10;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start like petrol engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop like petrol engine");
    }
}
