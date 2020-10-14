package datastructurealgorithm.array.array;

public class MethodArray {


    public static void main(String[] args) {

        int[] number={ 34,35,56,20};
        minimum(number);

    }


    static void minimum(int [] arr){// this is method
        int min =arr[0];
        for(int i=0; i< arr.length; i++) {
               if(min>arr[i]){
                   min=arr[i];

            }

        }
        System.out.println(min);
    }

    static int[] getArray(){// this method

        return new int[]{34,35,56,20};
    }


}
