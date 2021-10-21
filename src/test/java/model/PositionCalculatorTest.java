package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionCalculatorTest {

    @Test
    public void calcPosBasedOnAccelerationTest(){
        float initVel = 10f;
        float accel = -1f;
        float time = 10f;

        PositionCalculator positionCalculator = new PositionCalculator();
        float pos = positionCalculator.calcPosBasedOnAcceleration(initVel,accel,time);
        Assertions.assertEquals(50f,pos);

    }

    @Test
    public void calcPosBasedOnVelocitySquaredTest(){
        float initVel = 10f;
        float accel = -1f;
        float finalVel = 0f;

        PositionCalculator positionCalculator = new PositionCalculator();
        float pos = positionCalculator.calcPosBasedOnVelocitySquared(initVel,finalVel,accel);
        Assertions.assertEquals(50f,pos);
    }

    @Test
    public void calcPosBasedOnChangeInVelocityTest(){
        float initialVelocity = 10f;
        float finalVelocity = 0f;
        float time = 10f;

        PositionCalculator positionCalculator = new PositionCalculator();
        float pos = positionCalculator.calcPosBasedOnChangeInVelocity(initialVelocity,finalVelocity,time);
        Assertions.assertEquals(50f,pos);
    }
}
