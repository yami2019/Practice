package datastructurealgorithm.array.randomnumber;

import java.util.Random;

public class LearnRandomNumber {

    public static void main(String[] args) {
        double[]stId= new double[10];// the number 10 it will generate from 1 to 30 only 10 numbers
        // random is a class
        Random random= new Random(1);// this object
        // seed means: is to plant something// means start level
        for(int i=0; i< stId.length; i++){
              stId[i]=random.nextInt(30);// bound here is the limit
              System.out.println(stId[i]);
        }
    }
}
