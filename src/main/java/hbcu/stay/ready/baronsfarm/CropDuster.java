package hbcu.stay.ready.baronsfarm;

public class CropDuster implements Aircraft, FarmVehicle {
    public void fly() {

    }

    public void operate() {

    }

    public void fertilize(CropRow cropRow) {
        System.out.println("Crops are fertilized" + cropRow);
    }

    @Override
    public String toString() {
        return "CropDuster{}";
    }
}