package model;

import java.io.IOException;

public class RocketLauncher {

    private Rocket rocketToBeLaunched;

    public RocketLauncher(String selection) throws IOException {
        ReadRocketDirectory readRocketDirectory = new ReadRocketDirectory();
        RocketSelector rocketSelector = new RocketSelector();
        rocketSelector.createRocketArrayList(readRocketDirectory.read());

        SelectionToIndex selectionToIndex = new SelectionToIndex();
        int selectionAsIndex = selectionToIndex.convert(selection);
        rocketToBeLaunched = rocketSelector.selectRocket(selectionAsIndex);
    }

    public float launch() {
        float heightAtBurnOut = rocketToBeLaunched.calculateRocketHeightAtBurnOut();
        return rocketToBeLaunched.calculateRocketApogee(heightAtBurnOut);
    }
}
