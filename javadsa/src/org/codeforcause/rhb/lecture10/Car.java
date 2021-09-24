package org.codeforcause.rhb.lecture10;

public abstract class Car<E extends Engine> {

    protected Engine engine;

    public abstract void start();

    public abstract void stop();

    public abstract void changeEngine(Engine engine);
}
