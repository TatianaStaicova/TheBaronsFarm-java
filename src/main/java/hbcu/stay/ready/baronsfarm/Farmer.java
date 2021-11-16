package hbcu.stay.ready.baronsfarm;

public class Farmer implements Person, Rider, Botanist{
    public void plant(Crop crop) {
        System.out.println("This farmer plants " + crop);
    }

    public void eat(Edible edible) {
        System.out.println("This farmer eats " + edible);
    }

    public void makeNoise() {
        System.out.println("This farmer love to sing and make some noises");
    }

    public void mount(Rideable rideable) {
        System.out.println("This farmer mounts on " + rideable);
    }

    public void dismount(Rideable rideable) {
        System.out.println("This farmer dismounts on " + rideable);
    }
}
