package OT.OOP.B2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<OrderItem> items = new ArrayList<>();
    private String status = "NEW";

    public Order(int id, Customer customer) {
        this.id = id; this.customer = customer;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double getTotalAmount() {
        return items.stream().mapToDouble(OrderItem::getTotal).sum();
    }

    public void printOrder() {
        System.out.println("Order #" + id + " - Customer: " + customer.getName());
        items.forEach(System.out::println);
        System.out.println("Total: " + getTotalAmount());
    }
}
