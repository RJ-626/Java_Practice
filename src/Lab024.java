import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        float [] marks= new float[5];
        System.out.println("Enter the marks of first subject");
         marks[0]=sc.nextFloat();
        System.out.println("Enter the marks of second subject");
        marks[1]=sc.nextFloat();
        System.out.println("Enter the marks of third subject");
        marks[2]=sc.nextFloat();
        System.out.println("Enter the marks of fourth subject");
        marks[3]=sc.nextFloat();
        System.out.println("Enter the marks of fifth subject");
        marks[4]=sc.nextFloat();

        for(int i=0;i<marks.length;i++){
            if(marks[i]<30){
                System.out.println("you are failed in the subject" + marks[i]);
            }
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
