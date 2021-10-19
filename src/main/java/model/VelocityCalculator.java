package model;

public class VelocityCalculator {

    //based on finalVelocity is equal to initial velocity plus acceleration times time
    public float calculateBasedOnAccelerationOverTime(float initialVelocity, float acceleration, float time) {
        return initialVelocity + (acceleration * time);
    }

    //derived from FinalVelocity squared = initialVelocity Squared plus 2 times the acceleration times the change in Position
    //Solving for change in acceleration gets this equation
    public float calculateBasedOnChangeInPosition(float initialVelocity, float acceleration, float changeInPosition) {
        return (float) Math.pow(initialVelocity,2)+(2*acceleration*changeInPosition);
    }
}
