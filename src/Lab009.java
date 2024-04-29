import java.util.Scanner;

public class Lab009 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the days between 1 to 7");
        int days_number=sc.nextInt();

        String days=null;
        switch(days_number) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;

            default:
                System.out.println("invalid data");
        }
        System.out.println("-End of Program-");

        }
    }

