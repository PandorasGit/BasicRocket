package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class RocketLauncherTest {

    @Test
    public void rocketApogeeTest() throws IOException {
        RocketLauncher rocketLauncher = new RocketLauncher("D");
        float apogee = rocketLauncher.launch();
        Assertions.assertEquals(355.9384f,apogee);
    }
}
