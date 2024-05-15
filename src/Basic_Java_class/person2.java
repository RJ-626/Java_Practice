package Basic_Java_class;

public class person2 {

    String name;

    person2(){
        System.out.println("DC");
    }

    person2(String ref_name){
       this.name=ref_name;

    }


    void printDetails(){
        System.out.println("your name is " + name);
    }
}
