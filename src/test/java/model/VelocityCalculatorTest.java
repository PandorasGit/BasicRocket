package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VelocityCalculatorTest {

    @Test
    public void calculateBasedOnAccelerationOverTimeTest(){
        float initialVelocity = 10f;
        float acceleration = -1f;
        float time = 10f;

        VelocityCalculator velocityCalculator =  new VelocityCalculator();
        float finalVelocity = velocityCalculator.calculateBasedOnAccelerationOverTime(initialVelocity,acceleration,time);
        Assertions.assertEquals(0f,finalVelocity);
    }

    @Test
    public void calculateBasedOnChangeInPositionTest(){
        float initialVelocity = 10f;
        float acceleration = -1f;
        float changeInPosition = 50f;


        VelocityCalculator velocityCalculator =  new VelocityCalculator();
        float finalVelocity = velocityCalculator.calculateBasedOnChangeInPosition(initialVelocity,acceleration,changeInPosition);
        Assertions.assertEquals(0f,finalVelocity);
    }
}
