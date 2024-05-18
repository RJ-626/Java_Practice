package oops_18th_May_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab068 {
    public static void main(String[] args) {
        List courselist= new ArrayList();

        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PyTB");
        courselist.add("CTB");

        List numlist= new ArrayList();
        numlist.add(150);
        numlist.add(100);
        numlist.add(150);
        numlist.add(250);

        courselist.addAll(numlist);
        System.out.println(courselist);

        Iterator iterator= courselist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
