package model;

public class VelocityCalculator {

    //based on finalVelocity is equal to initial velocity plus acceleration times time
    public float calculateBasedOnAccelerationOverTime(float initialVelocity, float acceleration, float time) {
        return initialVelocity + (acceleration * time);
    }
}
