package model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class RocketParserTest {

    @Test
    public void parseRocketListTest() throws IOException {
        InputStream inputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("TestRocketDirectory.json");
        JSONArray testArray = JsonPath.read(inputStream,"$..Rockets");

        RocketParser parseRockets = new RocketParser();
        Rocket resultRocket = parseRockets.parse(testArray, 0);
        Rocket testRocket = new Rocket(2.5f, 7.6f, 4.1f, 0.6f);

        System.out.println();
        Assertions.assertEquals(testRocket.calculateRocketHeightAtBurnOut(),resultRocket.calculateRocketHeightAtBurnOut());

    }

    @Test
    public void parseRocket4Test() throws IOException {
        InputStream inputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("TestRocketDirectory.json");
        JSONArray testArray = JsonPath.read(inputStream,"$.*");

        RocketParser parseRockets = new RocketParser();
        Rocket resultRocket = parseRockets.parse(testArray, 3);
        Rocket testRocket = new Rocket(20f, 42.2f, 17.27f, 1.6f);
        Assertions.assertEquals(testRocket.calculateRocketHeightAtBurnOut(),resultRocket.calculateRocketHeightAtBurnOut());

    }
}
