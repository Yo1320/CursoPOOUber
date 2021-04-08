public class PayPal extends Payment{
    String payAccount;

    public PayPal(Integer cantidad, String payAccount){
        super(cantidad);
        this.payAccount = payAccount;
    }
    void printDataPayPal(){
        System.out.println("El pago es de: " +cantidad + " con PayPal: " + payAccount);
    }
}
