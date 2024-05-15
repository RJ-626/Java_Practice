package oops_14th_May_2024.Abstration.Interface.Realtimeexmple;

public class Car implements Engine,Break {

    void start(){
        System.out.println("Start now");
        StartEngine();
        Break();
    }

    @Override
    public void StartEngine() {
        System.out.println("Started Engine");

    }

    @Override
    public void Break() {
        System.out.println("Breaks are fine");
    }
}
