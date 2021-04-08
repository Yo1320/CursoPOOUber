public class UberX extends Car {
    
    public UberX(String license, Account driver, Integer passengers, String brand, String model){
        super(license, driver, passengers, brand, model);
        }
    @Override
    public void setPassengers(Integer passengers){
        if(passengers == 4){
            this.passengers = passengers;
        }else{
            System.out.println("Introduce el número correcto de pasajeros");
        }
    }
    void printDataUberX(){
        //if(passengers == 4){
            System.out.println("Type Uber: Uber X. License: " + license + " Driver: " + driver.name + " Brand: " + brand + " Model: " + model + ". Passengers: " + passengers);
        //}else{
           // System.out.println("Introce el número correcto de pasajeros");
        }    
}



