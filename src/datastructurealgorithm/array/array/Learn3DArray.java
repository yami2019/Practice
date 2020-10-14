package datastructurealgorithm.array.array;

public class Learn3DArray {
    // 3D Arrays = 2D+1D
    //DATATYPE[SIZE][ROW][COLUMN] NAME= NEW DATATYPE[SIZE][ROW][COLUMN]



    static String[][][] pizza= new String[4][4][5];// DECLARE 3D ARRAY

    public static void main (String [] args) {
        //  we need to call the datastructurealgorithm.array.array inside of the main method // so because it is static we will call by class name

        Learn3DArray.pizza[0][0][0] = "sl";
        Learn3DArray.pizza[0][0][1] = "pizza type";
        Learn3DArray.pizza[0][0][2] = "price ";
        Learn3DArray.pizza[0][0][3] = "qty";
        Learn3DArray.pizza[0][0][4] = "amount";


        Learn3DArray.pizza[0][1][0] = "101";
        Learn3DArray.pizza[0][1][1] = "cheese";
        Learn3DArray.pizza[0][1][2] = " 12";
        Learn3DArray.pizza[0][1][3] = "2";
        Learn3DArray.pizza[0][1][4] = "24";


        Learn3DArray.pizza[0][2][0] = "102";
        Learn3DArray.pizza[0][2][1] = "veggie";
        Learn3DArray.pizza[0][2][2] = " 10";
        Learn3DArray.pizza[0][2][3] = "3";
        Learn3DArray.pizza[0][2][4] = "30";


        Learn3DArray.pizza[0][3][0] = "103";
        Learn3DArray.pizza[0][3][1] = "chicken pizza";
        Learn3DArray.pizza[0][3][2] = " 14";
        Learn3DArray.pizza[0][3][3] = "4";
        Learn3DArray.pizza[0][3][4] = "56";

        System.out.println(Learn3DArray.pizza.length);// THIS LINE IS TO CHECK THE SIZE OF THE ARRAY
        System.out.println(Learn3DArray.pizza[0][3][1]);
        // now i want to print all the value from 3D datastructurealgorithm.array.array:{ WE WILL USE FOR EACH (:)}
        for (String[][] pizz : Learn3DArray.pizza) { // so here we will read all the  3D datastructurealgorithm.array.array
            // THIS IS PARENT FOR EACH LOOP CONVERT 3D ARRAY TO 2D ARRAY
            for (String[] piz : pizz) {// child for each loop// here we convert 2D TO 1D ARRAY
                for (String pi : piz) {
               System.out.print(pi+" ");

                }
          System.out.println();

            }

        }
    }

}
