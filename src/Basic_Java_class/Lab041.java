import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ,checking for palindrome");
        String name=sc.next();

        boolean result= isPalindrome(name);
        if (result){
            System.out.println( name + " is a palindrome ");
        } else
            System.out.println( name + " is not a palindrome ");
    }


    private static boolean isPalindrome(String name) {
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        return name.equalsIgnoreCase(sb.toString());


    }

}
