package oops_11th_May_2024.accessModifiers.police;

public class Cop {

    public int gun;

    public Cop(int gun){
       this.gun =gun;

    }
    protected void canIShoot(){
        System.out.println("you can shoot");
    }
}
