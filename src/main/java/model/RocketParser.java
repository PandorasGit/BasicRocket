package model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

public class RocketParser {
    public Rocket parse(JSONArray inputJson, int index) {

        JSONArray rocketInfo = JsonPath.read(inputJson,String.format("$..Rockets[%d]",index));
        JSONArray impulseJson = JsonPath.read(rocketInfo,"$..specificImpulse");
        float specificImpulse = Float.parseFloat(impulseJson.get(0).toString());

        JSONArray wetMassJson = JsonPath.read(rocketInfo,"$..wetMass");
        float wetMass = Float.parseFloat(wetMassJson.get(0).toString());

        JSONArray dryMassJson = JsonPath.read(rocketInfo,"$..dryMass");
        float dryMass = Float.parseFloat(dryMassJson.get(0).toString());

        JSONArray timeToBurnOutJson = JsonPath.read(rocketInfo,"$..timeToBurnOut");
        float timeToBurnOut = Float.parseFloat(timeToBurnOutJson.get(0).toString());

        return new Rocket(specificImpulse,wetMass,dryMass,timeToBurnOut);
    }
}
