package core.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
- streamapi la 1 tinh nang quan trong dc gioi thieu trong java 8
- no giup xu ly tap hop du lieu (Collection,array) theo phong cach lap trinh ham : ngan gon, ro rang va hieu qua hon
1.Stream api la j
- stream dai dien cho mot chuoi cac phan tu du lieu co the dc xu ly
-stream khac voi collection
-collection luu tru du lieu
- stream ko luu tru du lieu, ma chi xu ly luong du lieu
2. tinh chat cua Stream APi
- ko thay doi du lieu goc -> cac thao tac tren stream ko lam thay doi collection ban dau
-lazyExecution -> cac thao tac trung gian chi chay khi co terminal operation
- ko luu tru du lieu -> chi xuly khi can
-ho tro xu ly song song -> de dang tan dung cpu da luong voi parallelsream()
3. Cac loai thao tac trong Stream Api
 Intermediate Operations (Thao tác trung gian)
 tra ve mot stream moi, co the sau chuoi nhieu thao tac. thao tac trung gian pho bien
 -filter() - loc phan tu
 map() - chuyen doi du lieu
 sorted sap xep
 distinct() - loai bo trung lap
 limit () gioi han so phan tu
Terminal Operations (Thao tác kết thúc)

Kết thúc luồng xử lý, trả về kết quả (giá trị hoặc collection). Dưới đây là một số phương thức thao tác kết thúc phổ biến:

forEach() – duyệt và in
collect() – gom kết quả thành Collection
reduce() – gộp các phần tử thành một giá trị
count() – đếm phần tử
findFirst() – lấy phần tử đầu tiên
long count = numbers.stream()
                    .filter(n -> n > 3)
                    .count();
System.out.println(count); // Output: 3
4. quy trinh su dung api
Mot chuoi thao tac voi stream gom 3 buoc tinh
1. tao stream
Tu Ocllection:List.stream() hoac list.parallelStreamm()
- tu mang : arrays.stream(array)
tu gia tri:stream.of()
2. Intermediate Operations (xử lý trung gian)

Lọc: filter()
Biến đổi: map()
sắp xếp: sorter()
Loại bỏ trùng lặp: distinct()
…
3. Terminal operation (thao tac ket thuc)
thu ket qua cuoi cung nhu foreach(),Collect(),Reduce()
5.parallel Stream - neu muon tan dung da luong cpu de tang toc, ta dung parallelStream() thay vi stream()
6. UU diem cua stream Api
-code ngan gon, de hieu -> thay the nhieu vong lap phuc tap
- de mo rong -> de dang them thao tac moi ma ko can sua nhieu code
- hieu suat cao -> ho tro xu ly song song de tamg  toc vs du lieu lon

 */
public class JavaStreamApi {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("Java","Spring","Hibernate");
        // tao stream va xu ly du lieu
        names.stream()
                .filter(s->s.startsWith("J")).forEach(System.out::println);// output Java
        // vd :
        List<Integer>numbers =Arrays.asList(1,2,3,4,5,6);
        numbers.stream()
                .filter(n-> n%2==0)// so chan
                .map(n-> n*n)// binh phuong
                .forEach(System.out::println);// ouput 4,16,36
        // parallel stream
        List<Integer>bigList = IntStream.rangeClosed(1,1_000_000)
                .boxed()
                .toList();
        Long count = bigList.parallelStream()
                .filter(n->n%2 ==0)
                .count();
        System.out.println(count);// dem so chan nhanh hon nho da luong


    }
}
