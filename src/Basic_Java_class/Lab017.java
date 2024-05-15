package Basic_Java_class;

public class Lab017 {
    public static void main(String[] args) {

        for(int i=0;i<=50;i++){
            if(i%2==0) {
                System.out.println(i + " is an even number");
                continue;
            }
            System.out.println(i+" is an odd number");
        }
    }
}
