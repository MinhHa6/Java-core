package Lab07.Set;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<String> words= new HashSet<>();
        words.add("Vn");
        words.add("Nhat ban");
        words.add("Han Quoc");
        words.add("Trung Quoc");
        System.out.println(words);
        // kiem tra xem phan tu co ton tai hay ko
        System.out.println(words.contains("vn"));
        // xoa phan tu
        System.out.println(words.remove("Trung Quoc"));
        System.out.println(words);
        // ko lay phan tu trung lap
        System.out.println("Do dai cua set la :"+words.size());
    }
}
