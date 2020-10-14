package datastructurealgorithm.array.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    // Map is interface
    // map is working in base of <key,Value
    // the syntax is: Map<String(key),String(value)> name of the map= new HashMap<>();


    String name="james";
    public static void main(String[] args) {
        Map<String,String> stateMap= new HashMap<>();
                // hashMap is a class that accept implement map
        stateMap.put("USA","NY");// here it's how insert the key and the value
        stateMap.put("Canada","Oh");
        stateMap.put("India","Delhi");
        stateMap.put("Algeria","TIzi ouzou");
        System.out.println(stateMap.get("Algeria"));// i call the key so the output will be the value

         System.out.println("***********************************************");

        // how to call all the value: we will use for each
        for (Map.Entry<String,String> entry:stateMap.entrySet()) {
            System.out.println(entry.getKey() + ":" +entry.getValue());
        }


    }



}
