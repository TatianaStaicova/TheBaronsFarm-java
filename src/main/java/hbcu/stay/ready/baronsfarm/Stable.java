package hbcu.stay.ready.baronsfarm;

import java.util.List;

public class Stable {private List<Horse> horses;
    //a stable has a collection of horses


    public Stable() {
    }

    public Stable(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Stable{" +
                "horses=" + horses +
                '}';
    }
}