package datastructurealgorithm.array.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTravers {
// we use hashMAP TO CHECK how may times number is repeated
    public static void main(String[] args) {
        int[] numbers={23,35,56,23,234,45,55,23,45};
        printFrequency(numbers);
    }

    public static  void printFrequency(int[] arr){
        HashMap<Integer,Integer> hmap= new HashMap<>();
        for(int i=0; i< arr.length;i++){
            Integer c= hmap.get(arr[i]);
            // now we need to compare:
            if(hmap.get(arr[i])==null){
                hmap.put(arr[i],1);// 1 here is it's null so the output will be 1
            }else{// if it's not null so it will be ++c
                hmap.put(arr[i],++c);
            }
        }
       for(Map.Entry mp:hmap.entrySet()){
           System.out.println("frequency of"+ mp.getKey()+":"+mp.getValue());
       }

    }
}
