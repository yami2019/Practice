package datastructurealgorithm.array.array;
import java.util.ArrayList;
public class LearnArrayList {




        public static void main(String[] args) {


            String[] fruits = new String[4];
            fruits[0] = "Mango";
            fruits[1] = "Apple";
            fruits[2] = "Banana";
            fruits[3] = "Strawberry";
            System.out.println(fruits[1]);

            ArrayList<String> fruitList= new ArrayList<>();
             fruitList.add("Mango");
             fruitList.add("banana");
             fruitList.remove("banana");

             System.out.println(fruitList);
        }




    }



