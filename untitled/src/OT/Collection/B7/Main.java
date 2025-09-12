package OT.Collection.B7;

public class Main {
    public static void main(String[] args) {
        // Tạo vài sản phẩm mẫu
        Product p1 = new Product("P01","Bàn",500000.);
        Product p2 = new Product("P02","Ghế",200000.);
        Product p3 = new Product("P03","Đèn",100000.);

        // Tạo đơn hàng 1
        Order o1 = new Order("O01");
        o1.addItem(new OrderItem(p1,2));
        o1.addItem(new OrderItem(p2,4));

        // Tạo đơn hàng 2
        Order o2 = new Order("O02");
        o2.addItem(new OrderItem(p2,2));
        o2.addItem(new OrderItem(p3,5));

        // Quản lý đơn hàng
        OrderManager om = new OrderManager();
        om.addOrder(o1);
        om.addOrder(o2);

        // In tổng tiền đơn
        System.out.println(o1+" | Tổng: "+o1.getTotal()+"đ");
        System.out.println(o2+" | Tổng: "+o2.getTotal()+"đ");

        // Tìm đơn hàng cao nhất
        Order maxOrder = om.findMaxOrder();
        System.out.println("💰 Đơn có tổng cao nhất: "+maxOrder);

        // Thống kê số lượng bán
        om.countProductSales();
    }

}
