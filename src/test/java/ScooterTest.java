import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.linesOf;

public class ScooterTest {

    Scooter scooter;



    @BeforeEach
    void setUp(){
      scooter = new Scooter("MobilityPlus+", 3,1,"Electric");
    }

    @Test

    void noiseOfEngineNoiseWith__noArgument(){

        String expected="MobilityPlus+ makes a  whirring! noise";
        String result= scooter.engineNoise();
        assertThat(result).isEqualTo(expected);
    }

    @Test

    void noiseOfEngineNoiseWith__Argument(){
        assertThat(scooter.engineNoise("Whirring!")).isEqualTo("The engine sound goes like Whirring!");
    }

    @Test

    void canReachMaxSpeed(){
        assertThat(scooter.maxSpeed(18)).isEqualTo("MobilityPlus+ reaches a top speed of 18 mph");
    }


}
