public class ElectricBike extends Vehicle{
    public ElectricBike(String name, int numberOfWheels, int maximumOccupancy, String fuelType) {
        super(name, numberOfWheels, maximumOccupancy, fuelType);
    }


    @Override
    public String engineNoise() {
        return "humming";
    }
    //overload
    public String engineNoise(String noise){
        return "makes " + noise + " noise";
    }


    @Override
    public String maxSpeed(int speed) {
        return String.format("%s reaches a top speed of %s mph",this.name,speed);
    }
}
