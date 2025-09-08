package OT.OOP.B2;

public class PaypalPayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via PayPal.");
    }
}
