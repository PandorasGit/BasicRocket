package model;

public class TsiolkovskyRocketEquation {
    //functions from the Tsiolkosky Rocket equation Delta V = specificImpulse times gravity times natural log of wetmass over dry mass



    public float naturalLogOfChangeInMassTest(float wetMass, float dryMass) {
        return (float) Math.log10(wetMass/dryMass);

    }

    public float getSpecificImpulseInMetersPerSecond(float specificImpulse) {
        return  specificImpulse*9.8f;
    }

    public float getDeltaV(float lnOfWetMassOverDryMass, float specificImpulseMs) {
        return lnOfWetMassOverDryMass * specificImpulseMs;
    }
}
