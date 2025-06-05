package Lab07.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class M_a_p {
    public static void main(String[] args) {
        // 1. HashMap: không đảm bảo thứ tự
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Ba");
        hashMap.put(1, "Một");
        hashMap.put(2, "Hai");
        hashMap.put(4, "Bốn");
        hashMap.put(2, "Hai "); // Ghi đè

        System.out.println(" HashMap (Không thứ tự):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 2. TreeMap: sắp xếp theo key
        Map<Integer, String> treeMap = new TreeMap<>(hashMap); // Truyền từ HashMap
        System.out.println("\n TreeMap (Sắp xếp theo key):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 3. LinkedHashMap: giữ nguyên thứ tự thêm
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Ba");
        linkedHashMap.put(1, "Một");
        linkedHashMap.put(2, "Hai");
        linkedHashMap.put(4, "Bốn");

        System.out.println("\n LinkedHashMap (Thứ tự thêm):");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 4. Xóa phần tử
        linkedHashMap.remove(2);
        System.out.println("\n LinkedHashMap sau khi xóa key = 2:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
