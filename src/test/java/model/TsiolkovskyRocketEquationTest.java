package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TsiolkovskyRocketEquationTest {

    @Test
    public void naturalLogOfChangeInMassTest(){
        float wetMass = 10f;
        float dryMass = 5f;

        TsiolkovskyRocketEquation tsiolkovskyRocketEquation = new TsiolkovskyRocketEquation();
        float expectedResult=tsiolkovskyRocketEquation.naturalLogOfChangeInMassTest(wetMass,dryMass);
        Assertions.assertEquals(0.3010300099849701f,expectedResult);
    }

    @Test
    public void multipleImpulseByGravityTest(){
        float specificImpulse=10f;
        float gravity = 9.8f;

        TsiolkovskyRocketEquation tsiolkovskyRocketEquation = new TsiolkovskyRocketEquation();
        float expectedResult = tsiolkovskyRocketEquation.getSpecificImpulseInMetersPerSecond(specificImpulse);
        Assertions.assertEquals(98f,expectedResult);
    }

    @Test
    public void getDeltaVTest(){
        TsiolkovskyRocketEquation tsiolkovskyRocketEquation = new TsiolkovskyRocketEquation();
        float lnOfWetMassOverDryMass = tsiolkovskyRocketEquation.naturalLogOfChangeInMassTest(10f,5f);
        float specificImpulseMs = tsiolkovskyRocketEquation.getSpecificImpulseInMetersPerSecond(10f);

        float deltaV = tsiolkovskyRocketEquation.getDeltaV(lnOfWetMassOverDryMass,specificImpulseMs);
        Assertions.assertEquals(29.50094f,deltaV);

    }
}
