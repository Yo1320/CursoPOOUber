import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    public UberVan(String license, Account driver, Integer passengers, String brand, String model, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver, passengers, brand, model);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    void printDataUberVan(){
        if(passengers == 6){
            System.out.println("Type Uber: Uber X. License: " + license + " Driver: " + driver.name + " Brand: " + brand + " Model: " + model + ". Passengers: " + passengers);
        }else{
            System.out.println("Introce el número correcto de pasajeros");
        }
        
    }
}
