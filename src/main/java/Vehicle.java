public abstract class  Vehicle {

    protected String name;
   private int numberofWheels;

    private int maximumOccupancy;

    private String fuelType;

    public Vehicle(String name, int numberOfWheels, int maximumOccupancy, String fuelType){

        this.name = name;
        this.numberofWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.fuelType = fuelType;
    }
//   getters for constructors


    public String getName() {
        return this.name;
    }

    public int getNumberofWheels() {
        return this.numberofWheels;
    }

    public int getMaximumOccupancy() {
        return this.maximumOccupancy;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    // method for engine and maxspeed


    public abstract String  maxSpeed(int speed);

    public abstract String engineNoise();
}


