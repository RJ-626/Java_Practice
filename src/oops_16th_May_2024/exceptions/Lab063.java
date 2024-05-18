package oops_16th_May_2024.exceptions;

public class Lab063 {
    public static void main(String[] args) throws CustomException {

        Bank jpchase= new Bank("USD",100);
        Bank icici= new Bank("INR",100);
        System.out.println(icici.add(jpchase));

    }
}
