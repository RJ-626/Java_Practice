package oops_11th_May_2024.polymorphism.methodoverriding;

public class RC {
    public static void main(String[] args) {
        DOG d= new DOG();
        d.bark();

        Hound h = new Hound();
                h.bark();

        DOG  d2 = new Hound(); //Run time polymorphism
        d2.bark();

        //ound a= new DOG();// not possible in Java
    }
}
