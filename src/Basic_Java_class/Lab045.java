package Basic_Java_class;

import java.util.Scanner;

public class Lab045 {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name2= sc.next();
        person2 p2 = new person2(name2);
        p2.printDetails();

        System.out.println("Enter the name");
        String name3= sc.next();
        person2 p3 = new person2(name3);
        p3.printDetails();

        sc.close();
    }

}

