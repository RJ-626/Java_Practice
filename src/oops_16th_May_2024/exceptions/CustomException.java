package oops_16th_May_2024.exceptions;

public class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);
        System.out.println("Custom exp");
    }
}
