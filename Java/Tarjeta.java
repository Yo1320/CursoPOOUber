public class Tarjeta extends Payment{
    Integer NTarjeta;

    public Tarjeta(Integer cantidad, Integer NTarjeta){
        super(cantidad);
        this.NTarjeta = NTarjeta;
    }
    void printDataTarjeta(){
        System.out.println("El pago es de: " +cantidad + " con la tarjeta: " + NTarjeta);
    }
    
}
