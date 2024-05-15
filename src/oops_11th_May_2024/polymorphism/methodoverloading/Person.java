package oops_11th_May_2024.polymorphism;

public class Person {

    void gift(String a){
        System.out.println("A is a String " + a);
    }

    int gift(int x){
        System.out.println("X is an Int " + x);
        return x;
    }

    void gift(double x){
        System.out.println("X is a double " + x);
    }

}
