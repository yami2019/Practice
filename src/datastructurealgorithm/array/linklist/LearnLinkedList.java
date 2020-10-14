package datastructurealgorithm.array.linklist;

import java.util.LinkedList;

public class LearnLinkedList {

  LinkedList<String> fruitsColor= new LinkedList<>();
  LinkedList<String> pizzaList=new LinkedList<>();

    public static void main(String[] args) {
        // now we need to add value LINE7 IS NOT STATIC SO WE WILL CREATE OBJECT
        LearnLinkedList learn=new LearnLinkedList();// object
        learn.fruitsColor.add("Red");
        learn.fruitsColor.add("Yellow");
        learn.fruitsColor.add("Orange");
        learn.fruitsColor.add("green");

        // now how can print this value:
        //i want to print Red
        System.out.println(learn.fruitsColor.get(0));// 0 is the index
        // how to print all the value: we will use each loop
        for (String co:learn.fruitsColor) {
            System.out.println("Fruits Color "+ co);

        }
        // to print the void method i   need to call it inside the main method
        learn.getPizzaList();


    }
    /// let's create another methode:


    public void getPizzaList(){
        pizzaList.add("Cheese");
        pizzaList.add("Veggie");
        pizzaList.add("Mexican");
        pizzaList.add("Greec");

        // now i want to print all the pizza name i will use for each loop
        for (String name:pizzaList) {
            System.out.println("Pizza name:" + name);
        }
    }
}
