package datastructurealgorithm.array.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {

    // Priority class is a class which abstract the queue
    public static void main(String[] args) {
        PriorityQueue<String> name = new PriorityQueue<>();
        name.add("Amina");
        name.add("Ariana");
        name.add("James");
        name.add("John");
        // now how to get the value
        System.out.println(name.peek());


        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.add(30);
        number.add(50);
        number.add(80);
        number.add(2);
        System.out.println(number.peek());


        for (Integer num : number) {
            System.out.println(num);
        }
        System.out.println("*****************************");
        System.out.println(number.poll());//the output will be 2 why ? it suppose to give 30 or 40(first value)

        System.out.println("*****************************");
        for (Integer num:number) {
            System.out.println(number);// why it prints 3 line of the same number [30, 50, 80]
                                                                              //  [30, 50, 80]
                                                                              //  [30, 50, 80]
        }

    }
}