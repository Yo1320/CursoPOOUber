public class Efectivo extends Payment {
    public Efectivo(Integer cantidad){
        super(cantidad);
    }
    void printDataEfectivo(){
        System.out.println("El pago es de: " +cantidad + " en efectivo.");
    }
    
}
