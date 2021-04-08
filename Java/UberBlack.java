import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    public UberBlack(String license, Account driver, Integer passengers, String brand, String model, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver, passengers, brand, model);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    void printDataUberBlack(){
        if(passengers == 4){
            System.out.println("Type Uber: Uber X. License: " + license + " Driver: " + driver.name + " Brand: " + brand + " Model: " + model + ". Passengers: " + passengers);
        }else{
            System.out.println("Introce el número correcto de pasajeros");
        }
        
    }
}
