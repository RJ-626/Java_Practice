package oops_16th_May_2024.exceptions;

public class Lab061 {
    public static void main(String[] args) {

extracted2();
    }

    public static void extracted2(){
        extracted1();
        System.out.println("will execute");
    }
    public static void extracted1(){
        extracted();
    }

    public static void extracted() {
        try {


            String name = null;
            name.length();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
