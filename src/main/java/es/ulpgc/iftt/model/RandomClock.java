package es.ulpgc.iftt.model;

import java.util.Random;

public class RandomClock implements Sensor {
    private Random random;

    public RandomClock() {
        this.random = new Random(System.currentTimeMillis());
    }

    @Override
    public Object getValue() {
        return new Integer(random.nextInt(86400));
    }
}
