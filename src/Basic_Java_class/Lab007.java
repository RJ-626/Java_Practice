package Basic_Java_class;

import java.util.Scanner;

public class Lab007 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the score");
        int score=sc.nextInt();

        if(score>=90 && score<=100) {
            System.out.println("your grade is A");
        }
        else if (score>=80 && score<=89) {
            System.out.println("your grade is B");
        }
        else if (score>=70 && score<=79) {
            System.out.println("your grade is C");
        }
        else if (score>=60 && score<=69) {
            System.out.println("your grade is D");
        }
        else  {
            System.out.println("your grade is F");
        }
    }
}
