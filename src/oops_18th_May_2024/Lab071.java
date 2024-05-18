package oops_18th_May_2024;

import java.util.Enumeration;
import java.util.Vector;

public class Lab071 {
    public static void main(String[] args) {

        Vector v = new Vector<>();

        v.add("Rahul");
        v.add("Alka");
        v.add("Delhi");
        v.add(23467);

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
