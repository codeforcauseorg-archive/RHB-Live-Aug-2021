package org.codeforcause.rhb.lecture10;

public class Maruti extends Car{

    public Maruti(){
        this.engine = new PetrolEngine();
    }

    @Override
    public void start() {
        this.engine.start();
    }

    @Override
    public void stop() {
        this.engine.stop();
    }

    @Override
    public void changeEngine(Engine engine){
        this.engine = engine;
    }
}
