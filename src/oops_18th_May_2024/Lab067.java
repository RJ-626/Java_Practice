package oops_18th_May_2024;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab067 {
    public static void main(String[] args) {

        List<String> mylist= new LinkedList<>();
        mylist.add("Rahul");
        mylist.add("Jaiswal");
        mylist.add("Delhi");
        System.out.println(mylist);

        List<Integer> l= new LinkedList<Integer>();
        l.add(2);
        l.add(4);

        Iterator iterator= l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
