package oops_14th_May_2024.Abstration.Interface;

public class RC {
    public static void main(String[] args) {
       //A a = new A();  //not possible to create a instance of interface or abstract class.
       B b =new B() ; // possible as it is concrete class
       //C c= new C() ;
    }
}
interface A{

}

class B{

}

abstract class C{

}
