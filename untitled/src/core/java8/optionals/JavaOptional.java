package core.java8.optionals;

import java.util.Optional;

/*
1. optional la j ?
- optional<T> java 8 la mot container object dung de chua gia tri co the ton tai hoac ko
- thay vi tra ve null va de gay loi nullpoterException , ta co the tra ve Optional.empty() haoc optional.of(value)
2. Muc dich cua optional
- tranh nullpoiterexception : Giup lap trinh vien xu ly truong hop gia tri null an toan
- viet code gon gang, ro rang :ko can thiet if(value != null) ruon ra
- khuyen khich lap trinh ham: Dung voi map(),filter(),orElsr() ...
 3.c u phap
// 1. Optional rỗng
Optional<String> empty = Optional.empty();

// 2. Optional với giá trị chắc chắn (không null)
Optional<String> name = Optional.of("TayJava");

// 3. Optional có thể null
String text = null;
Optional<String> maybeText = Optional.ofNullable(text);
4 . cac phuong thuc quan trong cua optional
#	Method	Mô tả
1	isPresent()	Trả về true nếu có giá trị.
2	isEmpty() (Java 11+)	Trả về true nếu không có giá trị.
3	get()	Lấy giá trị, nếu null sẽ NoSuchElementException.
4	orElse(value)	Trả về giá trị nếu có, nếu không thì trả về value.
5	orElseGet(Supplier)	Trả về giá trị nếu có, nếu không thì chạy Supplier.
6	orElseThrow()	Trả về giá trị nếu có, nếu không thì ném exception.
7	ifPresent(Consumer)	Nếu có giá trị thì thực hiện Consumer.
8	filter(Predicate)	Lọc giá trị nếu thỏa điều kiện.
9	map(Function)	Biến đổi giá trị bên trong.
10	flatMap(Function)	Giống map nhưng tránh Optional lồng nhau.
5. ung dung thuc te
- tra ve repository (JPa/Hibernate) tranh null khi tim kiem
- tranh check null nhieu lan trong service
- dung trong api de tra ve du lieu ko chac chan

 */
public class JavaOptional {
    public static void main(String[] args) {
        String name = null;
        // Optional thay vi null-check
        Optional<String>optionalName = Optional.ofNullable(name);
        System.out.println(optionalName.orElse("No name"));
        // vi du:Dung voi ifPresent
        Optional<String>email = Optional.of("Hello@tayJava.com");
        email.ifPresent(e-> System.out.println("email:"+e));
        // dung map de xu ly
        Optional<String>names= Optional.of("MinhHa");
        String upper = names.map(String :: toUpperCase).orElse("UnKOWN");
        System.out.println(upper);
        // vidu:Dung orElseGet de tinh toan gia tri mac dinh
        Optional<String>data =Optional.empty();
        String result =data.orElseGet(()-> "Generated value ");
        System.out.println(result);
    }
}
