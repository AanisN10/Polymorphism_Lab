import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {

    Garage garage;

    @BeforeEach
    void Setup(){
        garage = new Garage();
    }

    @Test
    void canCountVehicles(){
        assertThat(garage.countVehicles()).isEqualTo(0);
    }

    @Test
    void canAddtoGarage(){
        Car car = new Car("SSC Tuatara", 4, 2,"Methanol",true);
        garage.addVehicle(car);
        assertThat(garage.countVehicles()).isEqualTo(1);
    }

    @Test

    void canAddMultipleVehiclestoGarage(){
        Car car = new Car("SSC Tuatara", 4, 2,"Methanol",true);
        ElectricBike eBike = new ElectricBike("LimeBike", 2,1,"Electric");
        Scooter scooter = new Scooter("MobilityPlus+", 3,1,"Electric");

        garage.addVehicle(car);
        garage.addVehicle(eBike);
        garage.addVehicle(scooter);

        assertThat(garage.countVehicles()).isEqualTo(3);
    }

}
