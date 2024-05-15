package oops_15th_May_2024.InnerClass;

public class Lab056 {
    public static void main(String[] args) {
        Pramoda p= new Pramoda();
        Pramoda.Ipad ipad= new Pramoda.Ipad();
        ipad.eating();
    }
}

class Pramoda {
    int a = 12;

    void eat() {
        System.out.println("I eat");
    }

    static class Ipad {
        int b = 23;

        void eating() {
            System.out.println("I am eating an ipad now");
        }
    }
}
