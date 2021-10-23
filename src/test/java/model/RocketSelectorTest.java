package model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class RocketSelectorTest {

    @Test
    public void createRocketArrayTest() throws IOException {
        InputStream inputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("TestRocketDirectory.json");
        JSONArray rocketsJson = JsonPath.read(inputStream,"$.*");

        SelectionToIndex selectionToIndex = new SelectionToIndex();
        int selection = selectionToIndex.convert("a");
        RocketSelector rocketSelector = new RocketSelector();

        ArrayList<Rocket> rocketArrayList = new ArrayList<>();
        rocketArrayList.add(new Rocket(2.5f,7.6f,4.1f,0.6f));
        rocketSelector.createRocketArrayList(rocketsJson);

        Rocket resultRocket = rocketSelector.selectRocket(selection);
        Assertions.assertEquals(rocketArrayList.get(0).calculateRocketHeightAtBurnOut(),resultRocket.calculateRocketHeightAtBurnOut());
    }

    @Test
    public void rocketDTest() throws IOException {
        InputStream inputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("TestRocketDirectory.json");
        JSONArray rocketsJson = JsonPath.read(inputStream,"$.*");

        SelectionToIndex selectionToIndex = new SelectionToIndex();
        int selection = selectionToIndex.convert("d");
        RocketSelector rocketSelector = new RocketSelector();

        ArrayList<Rocket> rocketArrayList = new ArrayList<>();
        rocketArrayList.add(new Rocket(20f,42.2f,17.27f,1.6f));
        rocketSelector.createRocketArrayList(rocketsJson);


        Rocket resultRocket = rocketSelector.selectRocket(selection);
        Assertions.assertEquals(rocketArrayList.get(0).calculateRocketHeightAtBurnOut(),resultRocket.calculateRocketHeightAtBurnOut());
    }
}
