package model;

public class PositionCalculator {

    //code based on DeltaPosition = initialVelocity multiplied by time plus one half the acceleration multiplied by time squared
    public float calcPosBasedOnAcceleration(float initialVelocity, float acceleration, float time) {
        return  initialVelocity*time + (acceleration * (float)Math.pow(time,2))/2;
    }
}
