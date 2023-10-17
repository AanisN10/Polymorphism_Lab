public class Scooter extends Vehicle implements IVehicle{
    public Scooter(String name, int numberOfWheels, int maximumOccupancy, String fuelType) {
        super(name, numberOfWheels, maximumOccupancy, fuelType);
    }

    @Override
    public String engineNoise() {
        return String.format("%s makes a  whirring! noise",this.name);
    }

    //overload
    public String engineNoise(String message){
        return "The engine sound goes like " + message ;
    }

    @Override
    public String maxSpeed(int speed) {
        return String.format("%s reaches a top speed of %s mph",this.name,speed);
    }




}
