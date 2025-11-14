package core.javacollection.hashset;

import java.util.HashSet;

/*
1.Hash set la j ?
-hashset la 1 cau truc du lieu cua collection farmwork dc su dung de luu tru cac phan tu duy nhat, ko trung lap va j=ko duy tri thu tu sap xep.
Hashset dc trien khai dua tren hashMap su dung bang bam(hashtable) de luu tru cac phan tu, cho ne cac phan tu trong hashset ko dc sap xep theo thu tu nhat dinh
2. dac diem cua hashset
-ko cho phep phan tu trung lap:chi luu tru cac phan tu duy nhat.neu 1 phan tu da ton tai trong tap hop hashset se ko cho phep them phan tu do nua
-ko duy tri thu tu:Hash set ko dam bao thu tu cua cac phan tu
-ko cho phep phan tu null:hsahset cho phep them 1 phan tu null
- hieu suat cao vs cac thao tac co ban:hashset co hieu xuat trung binh o(1) cho thao tac them xoa va kiem tra su ton tai cau phan tu nho vao cau truc bang bam
3.Cach hoat dong cua hashset
- hashset su dung bang bam cua (thong qua phuong thuc hashcode ) de tinh toan vi tri cua phan tu trong bang bam.De them 1 phan tu vao hashset
java tinh toan gia tri bam hashcode cua phan tu va dat no tai vi tri tuong ung trong bang bam.Khi kiem tra phan tu trung lap,hashset su dung ca hashcode()
va equals() de xac dinh xem phan tu do ton tai hay chua
4. cac phuong thuuc quan trong cua hashset
HashSet cung cấp các phương thức sau để thao tác với tập hợp:

add(E e): Thêm một phần tử vào HashSet. Nếu phần tử đã tồn tại, phương thức này trả về false.
remove(Object o): Xóa một phần tử khỏi HashSet.
contains(Object o): Kiểm tra xem phần tử có tồn tại trong HashSet hay không.
size(): Trả về số lượng phần tử trong HashSet.
isEmpty(): Kiểm tra xem HashSet có trống hay không.
clear(): Xóa tất cả các phần tử khỏi HashSet.
5. khi nao nen dung hashset - khi can luu tru phan tu duy nhat va ko quan tam den thu tu cua choung
- khi muon tim kiem them xoa phan tu voi hieu suat cao
6. Ưu và nhược điểm của HashSet
Ưu điểm:
Hiệu suất cao cho các thao tác thêm, xóa và tìm kiếm phần tử.
Không cho phép phần tử trùng lặp.
Nhược điểm:
Không duy trì thứ tự của các phần tử.
Không thích hợp khi cần thao tác với các phần tử theo thứ tự (chèn hoặc sắp xếp).
 */
public class HashSettt {
    public static void main(String[] args) {
        // Khởi tạo HashSet
        HashSet hashSet = new HashSet<>();

        // Thêm phần tử vào HashSet
        hashSet.add("Cam");
        hashSet.add("Quýt");
        hashSet.add("Mít");
        hashSet.add("Dừa");

        // Thử thêm phần tử trùng lặp
        hashSet.add("Cam");

        // In ra các phần tử của HashSet
        System.out.println("HashSet: " + hashSet); // [Mít, Quýt, Cam, Dừa]

        // Kiểm tra sự tồn tại của một phần tử
        System.out.println("HashSet có chứa 'Quýt' không? " + hashSet.contains("Quýt")); // true

        // Xóa phần tử
        hashSet.remove("Mít");
        System.out.println("HashSet sau khi xóa 'Mít': " + hashSet); // [Quýt, Cam, Dừa]

        // Duyệt qua các phần tử trong HashSet


    }
}
