import java.util.ArrayList;

public class Garage {


    private ArrayList<Vehicle> vehicles;


    public Garage(){
        this.vehicles = new ArrayList<>();
    }

    public int countVehicles(){
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }
}
