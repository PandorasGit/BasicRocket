package model;

public class AccelerationCalculator {

    //Based on the equation Force = acceleration times mass
    public float calculateAcceleration(float force, float mass) {
        return force/mass;
    }
}
