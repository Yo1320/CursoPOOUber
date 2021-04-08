class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        UberX uberx1 = new UberX("AMD123", new Account("Andres Herrera", "AND123"), 5, "Chevrolet", "Aveo");
        uberx1.printDataUberX();

        UberPool uberpool1 = new UberPool("UP123", new Account("Pablo Alvarez", "PA123"), 4, "Chevrolet", "Spark");
        uberpool1.printDataUberPool();

        Efectivo payment1 = new Efectivo(150);
        payment1.printDataEfectivo();

        Tarjeta payment2 = new Tarjeta(320, 123456789);
        payment2.printDataTarjeta();

        PayPal payment3 = new PayPal(500, "anita@platzi.com");
        payment3.printDataPayPal();



     }

}