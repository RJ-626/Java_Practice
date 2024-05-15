package oops_15th_May_2024.InnerClass;

public class Lab054 {
    public static void main(String[] args) {
        OOC ooc=new OOC();
        OOC.SNIC icref= new OOC.SNIC();
        icref.show();
    }
}

class OOC{

    public static int o= 10;
    int b=23;

    static class SNIC{
        void show(){
            //System.out.println(b);
            System.out.println(o);
        }


    }

}
