package hbcu.stay.ready.baronsfarm;

public class Chicken extends Animal implements Produce {
    public void makeNoise() {
        System.out.println("Cock-a-doodle-doo!");
    }

    public void eat(Edible edible) {
        System.out.println("chicken eats");
    }

    public EdibleEgg yield() {
        return new EdibleEgg();
    }
}
