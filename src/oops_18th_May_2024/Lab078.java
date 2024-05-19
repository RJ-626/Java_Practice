package oops_18th_May_2024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab078 {
    public static void main(String[] args) {
        Set coursesets = new TreeSet();
        coursesets.add("ATB");
        coursesets.add("MTB");
        coursesets.add("PyTB");
        coursesets.add("JTB");
        coursesets.add("GATB");
        System.out.println(coursesets);

        for (Object o : coursesets) {
            System.out.println(o);
        }

        Iterator iterator = coursesets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
