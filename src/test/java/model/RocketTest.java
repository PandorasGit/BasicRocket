package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RocketTest {

    @Test
    public void calculateRocketHeightAtBurnOutTest(){
        float specificImpulse = 30f;
        float wetMass = 56f;
        float dryMass = wetMass-35f;
        float timeToBurnOut = 2.8f;

        Rocket rocketLauncher = new Rocket(specificImpulse,wetMass,dryMass,timeToBurnOut);
        float positionAtBurnOut = rocketLauncher.calculateRocketHeightAtBurnOut();
        Assertions.assertEquals(175.32874f,positionAtBurnOut);
    }

    @Test
    public void calculateRocketApogeeTest(){
        float specificImpulse = 30f;
        float wetMass = 56f;
        float dryMass = wetMass-35f;
        float timeToBurnOut = 2.8f;

        Rocket rocketLauncher = new Rocket(specificImpulse,wetMass,dryMass,timeToBurnOut);
        float positionAtBurnOut = rocketLauncher.calculateRocketHeightAtBurnOut();
        float rocketApogee = rocketLauncher.calculateRocketApogee(positionAtBurnOut);
        Assertions.assertEquals(975.52045f,rocketApogee);
    }
}
