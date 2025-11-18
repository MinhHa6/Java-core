package core.java8;
/*
java 8 la mo tphien ban quan trong trong lich su phat trien cua ngon ngu java, mang lai nhieu tinh nang moi va cai tien giup tang cuong hieu
suat, kha nang mo rong va lap trinh de dang hon
1. functional Interfaces
Interface chỉ có một phương thức trừu tượng.
Được đánh dấu với annotation @FunctionalInterface.
Ví dụ: Runnable, Callable, Comparator, và trong Java 8 thêm các interface như Predicate, Function, Consumer, Supplier.
2. Lambda Expressions
- bieu thuc lambda la 1 tinh nang quan trong cua java8, cho phep viet cac ham an danh trong java. no giup lam cho ma nguon ngan gon de doc va de bao tri hon, dac biet la khi lam viec
voi funtuonal interface
List<String> list = Arrays.asList("Java", "Python", "PHP");
list.forEach(s -> System.out.println(s));
3. Method References
Thay vì sử dụng biểu thức Lambda chúng ta có thể sử dụng tham chiếu phương thức để tham chiếu trực tiếp đến các phương thức.

list.forEach(System.out::println);
4. Default Methods
Java 8 cho phép các phương thức mặc định trong các interface, có nghĩa là các phương thức này có thể được triển khai ngay trong interface mà không bắt buộc các lớp kế thừa phải implements. Điều này giúp mở rộng các interface mà không làm hỏng tính tương thích ngược.

interface Vehicle {
    default void start() {
        System.out.println("Starting vehicle...");
    }
}
5. Streams API
Streams API giúp thao tác với tập hợp dữ liệu(Collection) theo cách dễ dàng và hiệu quả hơn, đặc biệt trong việc xử lý tập dữ liệu lớn. Nó hỗ trợ các thao tác như lọc filter(), ánh xạ map(), giảm reduce() và xử lý song song parallelStream() mà không cần phải viết mã vòng lặp phức tạp.

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> squares = numbers.stream()
                               .map(n -> n * n)
                               .toList();
 6. Optional
Optional là một lớp giúp xử lý các giá trị có thể là null, tránh việc phát sinh lỗi NullPointerException bằng cách cung cấp các phương pháp tiếp cận an toàn hơn với giá trị null.

Optional<String> name = Optional.ofNullable(null);
System.out.println(name.orElse("No Name"));
7. New Date and Time API
Java 8 giới thiệu gói java.time, giúp quản lý ngày và giờ một cách đơn giản, rõ ràng và mạnh mẽ hơn so với java.util.Date và java.util.Calendar

public class App {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate nextWeek = today.plusWeeks(1);
		LocalDate sunday = LocalDate.of(2024, Month.OCTOBER, 6);

		System.out.println(today);
		System.out.println(sunday);
		System.out.println(nextWeek);
	}
}
8. Nashorn JavaScript Engine
Java 8 giới thiệu Nashorn, một công cụ JavaScript được tích hợp vào JVM, cho phép chúng ta nhúng và chạy mã JavaScript trực tiếp từ Java. Tuy nhiên Nashorn đã bị loại bỏ trong Java 15, GraalVM là một sự thay thế hoàn hảo, với hiệu suất cao hơn và hỗ trợ đa ngôn ngữ tốt hơn. GraalVM có thể chạy JavaScript, Ruby, Python, và nhiều ngôn ngữ khác trên JVM.
9. Parallel Array Sorting
Java 8 cung cấp phương pháp sắp xếp mảng song song, giúp tăng tốc độ sắp xếp các mảng lớn bằng cách chia nhỏ và sắp xếp chúng đồng thời.

import java.util.Arrays;

public class App {
    static void main(String[] args) {
        int[] numbers = {3, 9, 5, 7, 1};
        Arrays.parallelSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
10. Improved Concurrency
Java 8 giới thiệu các công cụ mới để làm việc với các ứng dụng đa luồng như CompletableFuture và ForkJoinPool

CompletableFuture.supplyAsync(() -> "Hello")
                 .thenAccept(System.out::println);

 */
public class Java8 {
}
