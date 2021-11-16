package hbcu.stay.ready.baronsfarm;

import java.util.List;

public class ChickenCoop {
    private List<Chicken> chickens;
    //a chickencoop has a collection of chicken

    public ChickenCoop() {
    }

    public ChickenCoop(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" +
                "chickens=" + chickens +
                '}';
    }
}
