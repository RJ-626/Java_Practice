package oops_18th_May_2024;

import java.util.ArrayList;
import java.util.List;

public class Lab065 {
    public static void main(String[] args) {
        List<String> mylist= new ArrayList<>();

        mylist.add("Rahul");
        mylist.add("Jaiswal");
        //mylist.add(true);
        //mylist.add(234);

        //System.out.println(mylist);

        mylist.add("Delhi");
        //System.out.println(mylist);
        mylist.set(1,"Inadev");
        //System.out.println(mylist);
        mylist.remove("Delhi");
        System.out.println(mylist);

        /*for(int i=0;i< mylist.size();i++){

            System.out.println(mylist.get(i));
        }*/

        for(String o:mylist){
            System.out.println(o);
        }
    }
}
