package OT.OOP.B2;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public Double getTotal()
    {
        return product.getPrice()*quantity;
    }

    @Override
    public String toString() {
        return product.getName() + " x" + quantity + " = " + getTotal();
    }
}
