package hbcu.stay.ready.baronsfarm;

import java.sql.SQLOutput;

public class Horse extends Animal implements Rideable {
    public void eat(Edible edible) {
        System.out.println("Horse eat");
    }

    public void makeNoise() {
        System.out.println("I-ha-ha!");
    }
}
