package OT.Collection.B7;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private  String id;
    private List<OrderItem>items= new ArrayList<>();
    public Order (String id)
    {
        this.id=id;
    }
    public void addItem(OrderItem orderItem)
    {
        items.add(orderItem);
    }
    //tin tong tien
    public double getTotal()
    {
        return items.stream().mapToDouble(OrderItem::getSubtotal).sum();
    }
    public List<OrderItem>getItems()
    {
        return items;
    }
    @Override
    public String toString ()
    {
        return "Don"+id+"|Tong:"+getTotal()+"d";
    }
}
