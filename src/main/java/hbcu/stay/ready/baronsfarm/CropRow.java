package hbcu.stay.ready.baronsfarm;

public class CropRow {

    private Crop crop;

    public CropRow() {
        this.crop = new Crop() {
            public Edible yield() {
                return new Edible() {
                    @Override
                    public Boolean getHasBeenFertilized() {
                        return super.getHasBeenFertilized();
                    }

                    @Override
                    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
                        super.setHasBeenFertilized(hasBeenFertilized);
                    }

                    @Override
                    public Boolean getHasBeenHarvested() {
                        return super.getHasBeenHarvested();
                    }

                    @Override
                    public void setHasBeenHarvested(Boolean hasBeenHarvested) {
                        super.setHasBeenHarvested(hasBeenHarvested);
                    }

                    @Override
                    public String toString() {
                        return super.toString();
                    }
                };
            }
        };
    }

    public CropRow(Crop crop) {
        this.crop = crop;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    @Override
    public String toString() {
        return "CropRow{" +
                "crop=" + crop +
                '}';
    }
}

