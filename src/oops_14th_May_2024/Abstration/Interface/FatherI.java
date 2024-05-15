package oops_14th_May_2024.Abstration.Interface;

 interface FatherI {
     void loan1cr();


     default void print() {
         System.out.println("I am a hero");
     }
         static void print2(){
             System.out.println("I am a villain");

         }
     }

