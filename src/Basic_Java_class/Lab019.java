import java.util.Scanner;

public class Lab019 {
    public static void main(String[] args) {

        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();

        long fact=1;

        for (int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("factorial->" +fact);
    }
}
