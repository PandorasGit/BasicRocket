package model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;

public class ReadRocketDirectory {
    public JSONArray read() throws IOException {
        InputStream inputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("RocketDirectory.json");
        return JsonPath.read(inputStream,"$.*");
    }
}
