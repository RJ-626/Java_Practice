import java.util.Scanner;

public class Lab039 {
    public static void main(String[] args) {
        String name="NAMAN";

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


