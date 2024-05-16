package oops_15th_May_2024;

public class anonymusclass {
    public static void main(String[] args) {
        Student s1 = new Student() {

            @Override
            public void SetId() {

            }
        };
        s1.SetId();
    }
}



    abstract class B{
        int var_b= 13;

    }

    interface Student{

        int id=45;
        void SetId();
    }

