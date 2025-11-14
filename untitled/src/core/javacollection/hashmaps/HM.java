package core.javacollection.hashmaps;
import java.util.HashMap;
/*
1.HashMap la j
- hashmap la 1 trien khai cua map,hash map cho phep luu tru cho phep luu tru cac cap khao gia tri (key-valuses).HashMap su dung cau truc bang bam (hash table) de luutru cac phan tu,
cho phep truy cap nhanh chong va hieu qua cho thao tac nhu them tim kiem va xoa phan tu
2. Dac diem noi bat cua hashmap
- ko duy tri thu tu :hash map ko dam bao thu tu cua cac phan tu .cac phan tu co the luu tru theo thu tu ko xac dinh
- cho phep null: Hash map cho phep 1 khao null va nhieu gia tri null. tuy nhien chi co 1 khao null dc cho phep
Hiệu suất: Các thao tác như thêm, tìm kiếm và xóa phần tử trong HashMap có độ phức tạp trung bình là O(1), nhưng trong trường hợp xấu nhất (khi xảy ra nhiều va chạm hash), độ phức tạp có thể lên tới O(n).
Không đồng bộ hóa: HashMap không phải là thread-safe. Nếu cần sử dụng trong môi trường đa luồng, bạn có thể sử dụng Collections.synchronizedMap(new HashMap<>()) để tạo một bản sao đồng bộ của HashMap.
Tối ưu bộ nhớ: HashMap tự động điều chỉnh dung lượng (capacity) và hệ số tải (load factor) để tối ưu hóa bộ nhớ.
3. cac phuong thuc pho bien cua hashmap
put(K key, V value): Thêm một cặp khóa-giá trị vào HashMap.
get(Object key): Trả về giá trị tương ứng với khóa đã cho.
remove(Object key): Xóa cặp khóa-giá trị tương ứng với khóa đã cho.
containsKey(Object key): Kiểm tra xem khóa có tồn tại trong HashMap không.
containsValue(Object value): Kiểm tra xem giá trị có tồn tại trong HashMap không.
size(): Trả về số lượng phần tử trong HashMap.
keySet(): Trả về một tập hợp chứa tất cả các khóa trong HashMap.
5. Khi nào nên dùng HashMap?
Khi cần ánh xạ (key → value)
Ví dụ: lưu thông tin người dùng theo userId, đếm số lần xuất hiện của từ trong văn bản, cache dữ liệu với key duy nhất.



Khi cần truy cập/tìm kiếm nhanh theo key
Các thao tác chính (put, get, remove, containsKey) thường có độ phức tạp O(1) trung bình (nhờ hashing).

Nhanh hơn nhiều so với ArrayList hoặc LinkedList nếu bạn phải tìm kiếm theo key.



Khi key là duy nhất
HashMap không cho phép trùng key (key mới sẽ ghi đè key cũ).

Thích hợp để đảm bảo một "danh bạ" duy nhất.



Khi không quan trọng thứ tự các phần tử
HashMap không đảm bảo thứ tự khi duyệt.

Nếu bạn cần giữ thứ tự thêm → dùng LinkedHashMap.

Nếu bạn cần key được sắp xếp tự động → dùng TreeMap.



Khi không cần thread-safe
HashMap không an toàn trong môi trường đa luồng. Nếu cần thread-safe → dùng ConcurrentHashMap hoặc Collections.synchronizedMap(new HashMap<>()).


Khi KHÔNG nên dùng HashMap
Khi bạn cần duyệt theo thứ tự cụ thể → hãy dùng LinkedHashMap hoặc TreeMap.
Khi key không có hashCode() và equals() chuẩn xác → dễ gây bug (ví dụ key là một object tự viết nhưng chưa override đúng
 */
public class HM {
    public static void main(String[] args) {

        // Tạo một HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Thêm các phần tử vào HashMap
        map.put("Cam", 1);
        map.put("Quýt", 2);
        map.put("Mít", 3);
        map.put(null, 4); // Thêm khóa null
        map.put("Dừa", null); // Thêm giá trị null

        // Lấy giá trị từ HashMap
        System.out.println("Giá trị của khóa 'Quýt': " + map.get("Quýt")); // In ra 2

        // Kiểm tra xem HashMap có chứa khóa hoặc giá trị cụ thể không
        System.out.println("Có chứa khóa 'Mít' không? " + map.containsKey("Mít")); // In ra true
        System.out.println("Có chứa giá trị 4 không? " + map.containsValue(4)); // In ra true

        // Duyệt qua các phần tử của HashMap
        System.out.println("Các phần tử trong HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

    }
}

