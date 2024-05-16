package oops_16th_May_2024.exceptions;

public class Lab059 {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error");
        }
        finally{
            System.out.println("need to be executed anyhow ");
        }
    }
}
