package oops_11th_May_2024.accessModifiers.criminal;

import oops_11th_May_2024.accessModifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        //cop.canIShoot();
    }
}
