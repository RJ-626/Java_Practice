package oops_11th_May_2024.accessModifiers.police;

public class JrCop {
    public static void main(String[] args) {

        Cop cop = new Cop(2);
        System.out.println(cop.gun);
        cop.canIShoot();
    }
}
