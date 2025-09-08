package OT.OOP.B2;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("s1", "Laptop", 10000.);
        Product p2 = new Product("2", "Mouse", 20.);

        Customer c1 = new Customer("s1", "Hà", "ha@example.com");

        Order order = new Order(1, c1);
        order.addItem(new OrderItem(p1, 1));
        order.addItem(new OrderItem(p2, 2));

        c1.addOrder(order);

        order.printOrder();

        Payment payment = new CreditCardPayment();
        payment.pay(order.getTotalAmount());
    }
}
