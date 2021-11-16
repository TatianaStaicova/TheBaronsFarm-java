package hbcu.stay.ready.baronsfarm;

public class Pilot implements Rider{
    public void mount(Rideable rideable) {
        System.out.println("Pilot has mounted");
    }

    public void dismount(Rideable rideable) {
        System.out.println("Pilot has dismounted");

    }
}
