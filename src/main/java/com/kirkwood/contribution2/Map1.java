package com.kirkwood.contribution2;
import java.util.Map;
public class Map1 {
    public Map<String, String> mapAB_Miyada(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

}
