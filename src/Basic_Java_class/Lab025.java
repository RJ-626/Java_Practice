package Basic_Java_class;

public class Lab025 {
    public static void main(String[] args) {

        for(int i=0;i<=100;i++){
            if(i%3==0&& i%5==0){
                System.out.println("fizbuzz");
            }
            else if(i%3==0) {
                System.out.println("fizz");
            }
                else if (i%5==0){
                    System.out.println("Buzz");
                }
                else
                System.out.println(i);
            }




        }
    }

