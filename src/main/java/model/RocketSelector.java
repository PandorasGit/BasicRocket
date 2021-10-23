package model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.util.ArrayList;

public class RocketSelector {
    private ArrayList<Rocket> rocketArrayList = new ArrayList<>();

    public void createRocketArrayList(JSONArray rocketsJson) {
        RocketParser rocketParser = new RocketParser();
        for(int i =0;i<rocketsJson.size();i++){
            Rocket newRocket = rocketParser.parse(rocketsJson,i);
            rocketArrayList.add(newRocket);
        }
    }

    public Rocket selectRocket(int selection) {

        return rocketArrayList.get(selection);
    }
}
