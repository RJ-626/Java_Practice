import java.util.Scanner;

public class Lab031 {
    public static void main(String[] args) {


        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the value of a");
        int a =sc.nextInt();
        System.out.println("Enter the value of b");
        int b =sc.nextInt();

        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("The value of a and b are " + a + " and " +b);

    }

}

