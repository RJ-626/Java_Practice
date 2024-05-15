import java.util.Scanner;

public class Lab008 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a,b,c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if((a==b) && (b==c) && (c==a)){
            System.out.println("The triangle is equilateral");
        }
        else if((a==b)||(b==c)||(c==a)) {
            System.out.println("The triangle is isosceles");
        }
        else{
            System.out.println("The triangle is scalene");
        }
    }
}
