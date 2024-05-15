package Basic_Java_class;

import java.util.Scanner;

public class Lab040 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String for checking the palindrome ");
        String name=sc.next();

        String y="";

        for(int i=name.length()-1;i>=0;i--){
            y=y + name.charAt(i);
        }
        System.out.println(y);
        if(name.equalsIgnoreCase(y)){
            System.out.println( name + " is a palindrome ");
        } else
            System.out.println( name + " is not a palindrome ");
    }
}
