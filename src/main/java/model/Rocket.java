package model;

public class Rocket {

    private float deltaV;
    private float specificImpulse;
    private float wetMass;
    private float dryMass;
    private float timeToBurnOut;

    public Rocket(float specificImpulse, float wetMass, float dryMass, float timeToBurnOut) {
        this.specificImpulse = specificImpulse;
        this.wetMass = wetMass;
        this.dryMass = dryMass;
        this.timeToBurnOut = timeToBurnOut;
        this.deltaV = calulateDeltaV();
    }

    private float calulateDeltaV(){
        TsiolkovskyRocketEquation tsiolkovskyRocketEquation = new TsiolkovskyRocketEquation();
        float impulseInMs = tsiolkovskyRocketEquation.getSpecificImpulseInMetersPerSecond(specificImpulse);
        float lnOfMass = tsiolkovskyRocketEquation.naturalLogOfChangeInMassTest(wetMass,dryMass);

        return tsiolkovskyRocketEquation.getDeltaV(lnOfMass,impulseInMs);
    }

    public float calculateRocketHeightAtBurnOut() {
        PositionCalculator positionCalculator = new PositionCalculator();
        return positionCalculator.calcPosBasedOnChangeInVelocity(0,deltaV,timeToBurnOut);
    }
}
