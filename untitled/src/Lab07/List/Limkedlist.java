package Lab07.List;

import java.util.Collections;
import java.util.LinkedList;

public class Limkedlist {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        // 1. Thêm phần tử
        fruits.add("Cam");
        fruits.add("Táo");
        fruits.add("Chuối");
        fruits.add("Xoài");

        // 2. Hiển thị danh sách ban đầu
        System.out.println("Danh sách ban đầu: " + fruits);

        // 3. Sửa phần tử (giả sử sửa "Táo" thành "Táo đỏ")
        int index = fruits.indexOf("Táo");
        if (index != -1) {
            fruits.set(index, "Táo đỏ");
        }

        // 4. Xóa phần tử (Xóa "Cam")
        fruits.remove("Cam");

        Collections.sort(fruits);

        System.out.println("Sau khi sửa, xóa và sắp xếp: " + fruits);
    }

}
