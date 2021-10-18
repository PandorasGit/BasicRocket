package model;

public class PositionCalculator {

    //code based on DeltaPosition = initialVelocity multiplied by time plus one half the acceleration multiplied by time squared
    public float calcPosBasedOnAcceleration(float initialVelocity, float acceleration, float time) {
        return  initialVelocity*time + (acceleration * (float)Math.pow(time,2))/2;
    }

    //derived from FinalVelocity squared = initialVelocity Squared plus 2 times the acceleration times the change in Position
    //Solving for change in acceleration gets this equation
    public float calcPosBasedOnVelocitySquared(float initialVelocity, float finalVelocity, float acceleration) {
         float changeInVelocity = (float) (Math.pow(initialVelocity,2) - Math.pow(finalVelocity,2));
         return changeInVelocity / -(2*acceleration);
    }
}
