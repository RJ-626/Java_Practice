package Basic_Java_class;

public class Lab038 {
    public static void main(String[] args) {

        String name="PRAMOD";
        String y="";

        for(int i=name.length()-1;i>=0;i--){
            y=y + name.charAt(i);
        }
        System.out.println(y);
    }
}
