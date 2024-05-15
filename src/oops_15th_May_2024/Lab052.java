package oops_15th_May_2024;

public class Lab052 {
    public static void main(String[] args) {

        //System.out.println(StaticDemo.college_name);
        //StaticDemo.printName();

        StaticDemo s1= new StaticDemo();
        s1.version=99;
        s1.printVersion();

        StaticDemo.college_name="TTA";

        StaticDemo s2= new StaticDemo();
        s2.version=89;
        s2.printVersion();
    }
}
