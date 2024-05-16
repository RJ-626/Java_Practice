package oops_16th_May_2024.exceptions;

public class Lab058 {
    public static void main(String[] args) {

        try {
            String name = null;
            name.trim(); //exceptions occured here
            System.out.println("I am Rahul");
        } catch (Exception e) {
            System.out.println("You are trying to trim a null String,which is not possible in java");
        }
        System.out.println("Hi ,how are you?");
    }
}
