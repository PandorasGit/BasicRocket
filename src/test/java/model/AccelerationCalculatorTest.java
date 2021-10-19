package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AccelerationCalculatorTest {

    @Test
    public void calculateAcceleration(){
        float force = 10f;
        float mass = 10f;
        AccelerationCalculator accelerationCalculator = new AccelerationCalculator();

        float resultAcceleration = accelerationCalculator.calculateAcceleration(force,mass);

        Assertions.assertEquals(1f,resultAcceleration);
    }

    @Test
    public void calculateNegativeAcceleration(){
        float force = -10f;
        float mass = 10f;
        AccelerationCalculator accelerationCalculator = new AccelerationCalculator();

        float resultAcceleration = accelerationCalculator.calculateAcceleration(force,mass);

        Assertions.assertEquals(-1f,resultAcceleration);
    }
}
