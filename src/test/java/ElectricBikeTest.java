import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ElectricBikeTest {

    ElectricBike electricBike;

    @BeforeEach
    void setUp(){
        electricBike = new ElectricBike("LimeBike", 2,1,"Electric");

    }

    @Test

    void NoiseOfEngineWith__noArgument(){
        assertThat(electricBike.engineNoise()).isEqualTo("humming");
    }

    @Test

    void NoiseOfEngineWith__Argument(){
        String result = "makes humming noise";
        String expected = electricBike.engineNoise("humming");
        assertThat(result).isEqualTo(expected);
    }

    @Test

    void canReachMaxSpeed(){
        assertThat(electricBike.maxSpeed(28)).isEqualTo("LimeBike reaches a top speed of 28 mph");
    }

}
