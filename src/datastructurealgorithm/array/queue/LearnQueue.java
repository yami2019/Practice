package datastructurealgorithm.array.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    //queue: Java Queue is a collection of ordered elements (Or objects)
    // but it performs insert and remove operations differently.
    // FIFO(First in First out ) data structure. In a FIFO data structure,
    //    the first element added to the queue will be the first one to be removed.

    public static void main(String[] args) {
        Queue<String> name = new LinkedList<>();
        name.add("Yamina");
        name.add("James");
        name.add("Bilel");
        name.add("John");
        name.add("lili");
        for (String st : name) {// here to print all the list
            System.out.println("patient name" + name);
        }
        // here if i want to remove somebody
        name.remove("James");
        for (String st1 : name) {// here to print all the list
            System.out.println("patient name" + name);
        }
        System.out.println("***********************************");

        System.out.println(name.element());// this one the output will give me only the first name "Yamina"
        System.out.println("***********************************");

        System.out.println(name.poll());// the same here it will print the first name
        System.out.println(name.poll());// here i used the second poll it will give the 2 nd name(bilel)
        // but here bilel is the 3 rd position why? because we removed th James which is un the 2 nd we it's like he is the first name after we poll the first name

        System.out.println("***********************************");
        System.out.println(name.peek());// it peek the value "John" because poll it peek and remove it's like
        // we don't have any list name in the beginning so it will peek john


         // element:print the first value
         // remove:remove the first value
        //  poll: is working peek and remove
        //  peek: take value
    }


}