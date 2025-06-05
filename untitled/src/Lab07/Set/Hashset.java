package Lab07.Set;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // Thêm phần tử
        hashSet.add("Cam");
        hashSet.add("Táo");
        hashSet.add("Chuối");
        hashSet.add("Xoài");

        // Hiển thị
        System.out.println("HashSet ban đầu: " + hashSet);

        // Xóa phần tử
        hashSet.remove("Cam");

        // Cập nhật (phải xóa rồi thêm lại vì Set không hỗ trợ cập nhật trực tiếp)
        if (hashSet.contains("Táo")) {
            hashSet.remove("Táo");
            hashSet.add("Táo đỏ");
        }

        System.out.println("Cap nhat sau khi xoa: " + hashSet);
    }
}
