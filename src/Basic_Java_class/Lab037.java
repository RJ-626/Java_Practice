package Basic_Java_class;

public class Lab037 {
    public static void main(String[] args) {

        String name="RAHUL";
        char[] char_array= name.toCharArray();

        int left=0;
        int right=char_array.length-1;

        while(left<right){
            char temp= char_array[left];
            char_array[left]= char_array[right];
            char_array[right]= temp;
            left++;
            right--;

        }
        String rev_name= new String (char_array);
        System.out.println(rev_name);
    }
}
