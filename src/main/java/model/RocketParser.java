package model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

public class RocketParser {
    public Rocket parse(JSONArray inputJson, int index) {
        IndexToSelection indexToSelection= new IndexToSelection();
        String selection = indexToSelection.convert(index);

        String searchQuery = String.format("$..%s",selection);
        JSONArray rocketInfo = JsonPath.read(inputJson,searchQuery);

        float specificImpulse = setSpecificImpulse(rocketInfo);
        float wetMass = setWetMass(rocketInfo);
        float dryMass = setDryMass(rocketInfo);
        float timeToBurnOut = setTimeToBurnOut(rocketInfo);

        return new Rocket(specificImpulse,wetMass,dryMass,timeToBurnOut);
    }

    private float setSpecificImpulse(JSONArray rocketInfo){
        JSONArray impulseJson = JsonPath.read(rocketInfo,"$..specificImpulse");
        return Float.parseFloat(impulseJson.get(0).toString());
    }

    private float setWetMass(JSONArray rocketInfo){
        JSONArray wetMassJson = JsonPath.read(rocketInfo,"$..wetMass");
        return Float.parseFloat(wetMassJson.get(0).toString());
    }

    private float setDryMass(JSONArray rocketInfo){
        JSONArray dryMassJson = JsonPath.read(rocketInfo,"$..dryMass");
        return Float.parseFloat(dryMassJson.get(0).toString());
    }

    private float setTimeToBurnOut(JSONArray rocketInfo){
        JSONArray timeToBurnOutJson = JsonPath.read(rocketInfo,"$..timeToBurnOut");
        return Float.parseFloat(timeToBurnOutJson.get(0).toString());
    }
}
