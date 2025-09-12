package OT.Collection.B7;

import java.util.*;

public class OrderManager {
    private List<Order>orders= new ArrayList<>();
    //tao don hang moi
    public void addOrder(Order order)
    {
        orders.add(order);
    }
    // tim don hang co tong cao nhat
    // Tìm đơn có tổng cao nhất
    public Order findMaxOrder(){
        return orders.stream().max(Comparator.comparingDouble(Order::getTotal)).orElse(null);
    }

    // Đếm số lần mỗi sản phẩm được bán
    public void countProductSales() {
        Map<Product, Integer> countMap = new HashMap<>();

        for (Order o : orders) {
            for (OrderItem item : o.getItems()) {
                Product p = item.getProduct();
                int soLan = countMap.getOrDefault(p, 0);
                countMap.put(p, soLan + item.getQuantity());
            }
        }

        System.out.println("📊 Thống kê số lượng sản phẩm đã bán:");
        for (Map.Entry<Product, Integer> e : countMap.entrySet()) {
            System.out.println("- " + e.getKey().getName() + ": " + e.getValue() + " sp");
        }
    }
}
