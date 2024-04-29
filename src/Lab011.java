import java.util.Scanner;

public class Lab011 {

    public static void main(String[] args) {

        Scanner user_input= new Scanner(System.in);
        System.out.println("Enter your name");
        String name = user_input.next();
        System.out.println("Enter your age");
        int age= user_input.nextInt();
        System.out.println("Enter your salary");
        double salary= user_input.nextDouble();

        System.out.println("Your name is" +" "+name);
        System.out.println("Your age is" +" "+age);
        System.out.println("Your salary is" +" "+salary);

        user_input.close();
    }
}
