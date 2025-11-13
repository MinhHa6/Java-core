package core.javacollection.javaarraylist;

import java.util.ArrayList;

/*
1.ArrList la j
-la 1 lop thuoc goi java.until arrayList la mot trong nhung trien khai pho bien nhat cua interfaceList .arrlist la mot mang dong,co kha nang
thay doi kich thuoc khi cac phan tu dc them vao haoc xoa khoi ds.Day la mot lop rat huu ich khi ban can luu tru mot ds cac phan tu va can thao tac
voi chung 1 cach linh hoat
2.cac dac diem chinh cua arraylist
-mang dong:kich thuoc cua arrayList co the thay doi linh hoat khi them hoac xoa cac phan tu, ko giong nhu cac mang tinh (array) co kich thuoc co dinh
-truy cap ngau nhien:array list cung cap thoi gian truy cap phan tu theo chi so index rat nhanh vi no dua tren mang,voi do phuc tap o)1)
-Khong dong bo: array list ko an toan cho cac thao tac dong thoi (multithering).neu su dung trong moi truong da luong can dong bo hoa hao thu cong
hoac su dung cac lop dong bo hoa nhu Collections.synchronizedList().
-thu tu chen:Arraylist duy tri thu tu cac phan tu dua tren thu tu chung dc them vao
-cho phep phan tu trung lap va gia tri null:arrlist co the chua cac gia tri trung lap va 1 hoac nhieu gia tri null
3. cac phuong thuc thuc pho bien cua arraylist
add(E e) : them phan tu vao cuoi ds
add(int index,E element): them phan tu vao phan tu chi dinh
remove(object o): Xoa pohan tu dau tien co gia tri tuong ung trong ds
remove(int index): Xóa phần tử tại vị trí chỉ định.
get(int index): Trả về phần tử tại vị trí chỉ định.
set(int index, E element): Cập nhật phần tử tại vị trí chỉ định với giá trị mới.
size(): Trả về số lượng phần tử trong danh sách.
clear(): Xóa toàn bộ các phần tử trong danh sách.
isEmpty(): Kiểm tra xem danh sách có rỗng không.
contains(Object o): Kiểm tra xem danh sách có chứa phần tử cụ thể không.
4. cach su dung
Một số điểm cần lưu ý khi sử dụng ArrayList
Hiệu suất: ArrayList có thời gian truy cập theo chỉ số là O(1) nhưng thời gian thêm, xóa phần tử ở giữa danh sách có thể là O(n) do việc phải dịch chuyển các phần tử còn lại.
Dung lượng: ArrayList có khả năng tự động tăng dung lượng khi cần nhưng điều này có thể tiêu tốn tài nguyên nếu việc mở rộng xảy ra quá nhiều.
5. Khi nao nen su dung arrayList
-su dung arraylist khi can 1 ds ma vc truy cap phan tu theo chi so la nhanh chong va ko can phai them hoac xoa phan tu qua nhieu
-neu can thao tac them/xoa phan tu thuong xuyen o dau hoac giua ds,co the can nhac su dung linkedList
 */
public class JavaArrList {
    public static void main(String[] args) {

        // khoi tao va them phan tu
        ArrayList fruits = new ArrayList<>();
        // them phan tu vao vao arraylist
        fruits.add("Cam"); // index = 0
        fruits.add("Quýt"); // index = 1
        fruits.add("Mít"); // index = 2
        fruits.add("Dừa"); // index = 3
        // In ra aarraylist
        System.out.println("Qua:"+fruits);
        // truy cap phan tu bang phuong thuc get(index)
        System.out.println("Qua:"+fruits.get(1));// lay ra qua o vi tri thu 1
        // cap nhat phan tu
        System.out.println("Qua"+fruits.set(1,"Tao"));// cap nhat gia tri quyt bang tao
        // xoa phan tu theo chi so hoac object
        System.out.println("Qua:"+fruits.remove("tao"));
        // duyet cac phan tu bang for each hoac vong lap thong thuong
        // su dung for each
        // Sử dụng for-each

// Sử dụng vòng lặp thông thường
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        // kiem tra kich thuoc va rong size() va isEmty()
        System.out.println("Kich thuoc ds:"+fruits.size());
        System.out.println("ds co bi trong ko:"+fruits.isEmpty());
        // kiem tra su ton tai cua phan tu su dung contains(object) de kiem tra arraylist co chua phan tu nao ko
        System.out.println("Co qua xoai ko?"+fruits.contains("xoai"));

    }
}
