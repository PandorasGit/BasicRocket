package model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class ReadRocketDirectoryTest {

    @Test
    public void readTest() throws IOException {
        InputStream inputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("TestRocketDirectory.json");
        JSONArray testArray = JsonPath.read(inputStream,"$.*");

        ReadRocketDirectory readRocketDirectory = new ReadRocketDirectory();
        JSONArray resultArray = readRocketDirectory.read();
        Assertions.assertEquals(testArray.toString(),resultArray.toString());

    }
}
