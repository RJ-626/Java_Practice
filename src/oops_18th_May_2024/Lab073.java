package oops_18th_May_2024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab073 {
    public static void main(String[] args) {
        List <Integer> myMarks= new ArrayList<>();
        myMarks.add(92);
        myMarks.add(72);
        myMarks.add(82);
        Collections.sort(myMarks);
        System.out.println(myMarks);
    }
}
