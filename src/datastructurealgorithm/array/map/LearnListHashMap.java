package datastructurealgorithm.array.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {

    public static void main(String[] args) {
        List<String> stateNameUSA = new ArrayList<>();
           stateNameUSA.add("NY");
           stateNameUSA.add("FL");
           stateNameUSA.add("NJ");
           stateNameUSA.add("CA");
           stateNameUSA.add("CT");

           List<String> stateNameCanada = new ArrayList<>();
          stateNameCanada.add("montreal");
          stateNameCanada.add("QUEBEC");
          stateNameCanada.add("Calgery");
          stateNameCanada.add("Toronto");

          List<String> stateNameUk = new ArrayList<>();
        stateNameUk.add("Liverpool");
        stateNameUk.add("Manchester");
        stateNameUk.add("London");

// HERE IS HOW WE USE A MAP WTH A LIST:
        Map<String,List<String>> stmap=new HashMap<>();
        stmap.put("USA",stateNameUSA);
        stmap.put("CANADA",stateNameCanada);
        stmap.put("UK",stateNameUk);

        for (Map.Entry<String,List<String>> entry  : stmap.entrySet()) {
         System.out.println(entry.getKey()+" : " + entry.getValue())   ;
        }
    }
}
