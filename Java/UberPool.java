public class UberPool extends Car {

    public UberPool(String license, Account driver, Integer passengers, String brand, String model){
        super(license, driver, passengers, brand, model);
    }
    void printDataUberPool(){
        if(passengers == 4){
            System.out.println("Type Uber: UberPool. License: " + license + " Driver: " + driver.name + " Brand: " + brand + " Model: " + model + ". Passengers: " + passengers);
        }else{
            System.out.println("Introce el número correcto de pasajeros");
        }
        
    }
}
