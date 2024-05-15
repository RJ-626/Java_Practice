package Basic_Java_class;

import java.util.Scanner;

public class Lab020 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();

        long sum=0;

        for(int i=1;i<=number;i++){
            sum=sum+i;
        }
        System.out.println("Sum of digit->"+sum);
    }
}
