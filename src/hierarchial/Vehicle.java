package hierarchial;

public class Vehicle {

    Vehicle(){
        System.out.println("DC Vehicle");

    }
    void vehicleHasTopSpeed(){
        System.out.println("fast " + getClass().getSimpleName());
    }
}
