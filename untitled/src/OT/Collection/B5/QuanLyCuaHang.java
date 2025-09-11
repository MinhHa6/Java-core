package OT.Collection.B5;

public class QuanLyCuaHang {
    public static void main(String[] args) {
        Store store= new Store();
        store.add(new Product("P01","Bánh", 150000.), 10);
        store.add(new Product("P02","Kẹo", 50000.), 30);
        store.add(new Product("P03","Nước", 120_000.), 20);

        System.out.println("== Danh sách sản phẩm ==");
        store.show();

        store.sellProduct("P01", 2);
        store.sellProduct("P02", 5);

        System.out.println("== Sau khi bán ==");
        store.show();

        System.out.println("Số sản phẩm > 100k: " + store.countExpensiveProducts(100_000));
    }


}
