package OT.Collection.B5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    private List<Product>listP= new ArrayList<>();
    Map<Product,Integer>stock= new HashMap<>();
     // ham them san pham vao ds va them so luong
    public void add (Product p,int quantity)
    {
        listP.add(p);
        stock.put(p, stock.getOrDefault(p,0)+quantity);
    }
    //ham in ra thong tin san pham
    public void show()
    {
        for(Product p:listP)
        {
            System.out.println(p+"-So luong:"+stock.get(p));
        }
    }

    public void sellProduct(String id,int quantity)
    {
        for(Product p:listP)
        {
            if(p.getId().equals(id))
            {
                int current=stock.getOrDefault(p,0);
                if(current>=quantity)
                {
                    stock.put(p,current-quantity);
                    System.out.println("Da ban:"+quantity+""+p.getName());
                }
                else {
                    System.out.println("Ko du hang");
                }
                return;
            }
        }
        System.out.println("Ko tim thay san pham ");
    }
    public long countExpensiveProducts(double price) {
        return listP.stream().filter(p -> p.getPrice() > price).count();
    }


}
