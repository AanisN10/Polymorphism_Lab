public class Car extends Vehicle implements IVehicle{

    private boolean rearwing;
    public Car(String name, int numberofWheels, int maximumOccupancy, String fuelType, boolean rearWing) {
        super(name, numberofWheels, maximumOccupancy, fuelType);
        this.rearwing = rearWing;
    }


    @Override
    public String maxSpeed(int speed) {
        return String.format("%s reaches a top speed of %s mph",this.name,speed);
    }

    @Override
    public String engineNoise() {
        return "Vroooooooom!";
    }

    public String engineNoise(String message){
        return "makes a " +message +" sound";
    }


}
