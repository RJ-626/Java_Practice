package oops_15th_May_2024.InnerClass;

public class Lab055 {
    public static void main(String[] args) {
        Pramod p= new Pramod();
        Pramod.Ipad ipad= p.new Ipad();
        ipad.eating();
    }
}

class Pramod{
    int a =12;
    void eat(){
        System.out.println("I eat");
    }

    class Ipad{
        int b=23;
        void eating(){
            System.out.println("I am eating now");
        }
    }
}
