package Inheritance;

public class Programming {

    int version;
    String author;

    Programming(){
        System.out.println("Default constructor");
    }

    Programming(int version,String author){
        this.version=version;
        this.author=author;
    }

    void printInfo(){
        System.out.println("version-> " +  this.version +  " author-> " +  this.author);
    }
}
