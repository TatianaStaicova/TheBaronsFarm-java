package hbcu.stay.ready.baronsfarm;

public class Tractor implements FarmVehicle{
    public void operate() {
        System.out.println("The tractor is operating");
    }
    public void harvest(Crop crop){
        System.out.println("Harvested crops " + crop);
    }
    @Override
    public String toString(){
        return "Tractor{}";
    }
}
