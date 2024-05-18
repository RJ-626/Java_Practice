package oops_18th_May_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab070 {
    public static void main(String[] args) {
        List courselist= new ArrayList();

        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PyTB");
        courselist.add("CTB");

        ListIterator lt1= courselist.listIterator(courselist.size());
        while (lt1.hasPrevious()){
            System.out.println(lt1.previous());
        }
    }
}
