package datastructurealgorithm.array.array;

import java.util.LinkedList;
import java.util.List;

public class StateList {

    public static void main(String[] args){
        List<String> stateNameList= new LinkedList<>();// list here is interface
        // linked list is a class , LIST IS IMPLEMENT SO LIST IS AN interface
        stateNameList.add("NY");
        stateNameList.add("VA");
        stateNameList.add("FL");
        stateNameList.add("NJ");

        // how to retrieve all the value? print// we will use for each loop
        for (String st:stateNameList) {
            System.out.println("State name :"+st);
        }







    }



}
