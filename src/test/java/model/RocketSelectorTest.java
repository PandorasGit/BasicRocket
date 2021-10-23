package model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class RocketSelectorTest {

    @Test
    public void selectRocketATest() throws IOException {
        InputStream inputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("TestRocketDirectory.json");
        JSONArray testArray = JsonPath.read(inputStream,"$.*");

        String selection = "A";

    }
}
