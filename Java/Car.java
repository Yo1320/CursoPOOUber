public class Car {
    protected Integer id;
    protected String license;
    protected Account driver;
    protected Integer passengers;
    protected String brand;
    protected String model;

    public Car(String license, Account driver, Integer passengers, String brand, String model){
        this.license = license;
        this.driver = driver;
        this.passengers = passengers;
        this.brand = brand;
        this.model = model; 
    }

   
    public Integer getPassengers(){
        return passengers;
    }
    public void setPassengers(Integer passengers){
        
        this.passengers = passengers; 
       
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    

}
