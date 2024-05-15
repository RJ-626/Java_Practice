package Basic_Java_class;

public class Dog {

    String name;


    Dog(){
        System.out.println("Default constructor");
    }

    Dog(String ref_name){
        this.name=ref_name;
        System.out.println("Param constructor");
    }

    void bark(){
        int age=10;
        System.out.println("Bark");
        System.out.println("the dog name is " + name);
    }
}
