package oops_16th_May_2024.exceptions;

public class Lab062 {

    public static void main(String[] args) {

        //extracted(10);
        extracted(0);
    }

    private static void extracted(int b) {
        int a;
        if (b == 0) {
            throw new ArithmeticException("b can't be zero");
        } else {
            a = 10 / b;
            System.out.println(a);
        }
    }
}

