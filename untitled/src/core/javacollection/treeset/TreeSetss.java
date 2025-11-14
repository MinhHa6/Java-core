package core.javacollection.treeset;
import java.util.TreeSet;
/*
1. treset la j
- la 1 cau truc du lieu thuoc javaclollection farmework dung de luu tru cac phan tu theo thu tu tu nhien hoac theo 1 tieu chi dc chi dinh
va ko cho phep cac phan tu trung lap. treeset dc trien khai tren navibableset va su dung cay nhi phan can bang (red back tree) de luu  tru va sap xep cac phan tu
2. Dac diem chinh cua treeset
- sap xep tu dong : Cac phan tu dc sap xep theo thu tu tu nhien hoac thepo thu tu du dong dc xac diinh boi comparator tuy chinh neu dc cung cap
- ko cho phep trung lap: treeset ko cho phep cac phan tu trung nhau. Neu ban co them phan tu ton tai,treeset se bo qua
- cau truc cay nhi phan can bang:
-ko cho phep null: treeset ko co phep gia tri null vi ko the xac dinh dc 1 cay sap xep
3. cac phuong thuc quan trong trong treeset
Một số phương thức thường dùng trong TreeSet bao gồm:

add(E e): Thêm một phần tử vào TreeSet.
remove(Object o): Xóa phần tử cụ thể khỏi TreeSet.
first(): Lấy phần tử nhỏ nhất (đầu tiên) trong TreeSet.
last(): Lấy phần tử lớn nhất (cuối cùng) trong TreeSet.
higher(E e): Lấy phần tử lớn hơn phần tử e gần nhất.
lower(E e): Lấy phần tử nhỏ hơn phần tử e gần nhất.
ceiling(E e): Lấy phần tử lớn nhất, bằng hoặc lớn hơn e.
floor(E e): Lấy phần tử nhỏ nhất, bằng hoặc nhỏ hơn e.
subSet(E fromElement, E toElement): Trả về một SortedSet chứa các phần tử từ fromElement đến toElement.
headSet(E toElement): Trả về một SortedSet chứa các phần tử nhỏ hơn toElement.
tailSet(E fromElement): Trả về một SortedSet chứa các phần tử lớn hơn hoặc bằng fromElement.
4. Uu nhuoc diem cua treeset
uu diem:
duy tri thu tu sap xep tu nhien
- cung cap hieu sau cho cac thao tac tim kiem
- ho tro thao tac dieu huong subnet,headset,tailset de lay cac tap con cua treeset
nhuoc diem
- ko cho phep phan tu null
-treeset hieu suat kem hon hashset trong truong hop ko can duy tri thu tu vi hsahset co thoi gian o(1) cho thao tac them xoa tim kiem
 */
public class TreeSetss {
    public static void main(String[] args) {
        // Khởi tạo TreeSet
        TreeSet treeSet = new TreeSet<>();

        // Thêm phần tử vào TreeSet
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);

        // TreeSet tự động sắp xếp các phần tử
        System.out.println("TreeSet: " + treeSet); // [5, 10, 15, 20]

        // Truy cập phần tử đầu tiên và cuối cùng
        System.out.println("Phần tử nhỏ nhất: " + treeSet.first()); // 5
        System.out.println("Phần tử lớn nhất: " + treeSet.last());  // 20

        // Sử dụng các phương thức điều hướng
        System.out.println("Phần tử lớn hơn 10: " + treeSet.higher(10)); // 15
        System.out.println("Phần tử nhỏ hơn 15: " + treeSet.lower(15));  // 10

        // Xóa phần tử
        treeSet.remove(10);
        System.out.println("TreeSet sau khi xóa 10: " + treeSet); // [5, 15, 20]
    }
}
