package hbcu.stay.ready.baronsfarm;

public class Edible {
    private Boolean hasBeenFertilized;
    private Boolean hasBeenHarvested;

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    @Override
    public String toString() {
        return "Edible{" +
                "hasBeenFertilized=" + hasBeenFertilized +
                ", hasBeenHarvested=" + hasBeenHarvested +
                '}';
    }
}