package Basic_Java_class;

import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size");
        int n =sc.nextInt();
        int []int_array= new int[n];

        System.out.println("enter the elements");
        for(int i=0;i<n;i++){

            int_array[i]=sc.nextInt();
        }
        System.out.println("--output--");

        for (int i=0;i<n;i++){
            System.out.println(int_array[i]);
        }
        sc.close();
    }
}
