package oops_18th_May_2024;

import java.util.HashSet;
import java.util.Set;

public class Lab075 {
    public static void main(String[] args) {

        Set fruits= new HashSet();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("apple");
        fruits.add("Litchi");
        fruits.remove("Litchi");

        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());
    }
}
