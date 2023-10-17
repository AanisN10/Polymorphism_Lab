import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach

    void setUp(){
        car = new Car("SSC Tuatara", 4, 2,"Methanol",true);
    }


    @Test

    void canMakeNoise__noArgument(){
        String expected="Vroooooooom!";
        String result= car.engineNoise();
        assertThat(result).isEqualTo(expected);
    }

    @Test

    void canMakeNoise__withArgument(){
        String expected="makes a Vroom sound";
        String result= car.engineNoise("Vroom");
        assertThat(result).isEqualTo(expected);
    }


    @Test
    void canReachMaxSpeed(){
        String expected = "SSC Tuatara reaches a top speed of 295 mph";
        String result = car.maxSpeed(295);
        assertThat(result).isEqualTo(expected);
    }

}
