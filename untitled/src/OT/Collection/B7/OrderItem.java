package OT.Collection.B7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    public Product getProduct(){ return product; }
    public int getQuantity(){ return quantity; }

    @Override
    public String toString() {
        return product.getName()+" x "+quantity+" = "+getSubtotal()+"đ";
    }
}
