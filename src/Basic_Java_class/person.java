public class person {

    String name;
    long phone;
    String email;
    boolean ismarried;

    person(){
        System.out.println("I am called");
        System.out.println("Rahul");
    }

    person(String name){
        this.name=name;
    }
    void talk(){
        System.out.println("talk");
    }
    void walk(){
        System.out.println("walk");
    }
     void printDetails(){
         System.out.println(name);
         System.out.println(phone);
         System.out.println(email);
         System.out.println(ismarried);
     }
}
