package core.java8.functionalinterfaces;

import Lab04.B2.Customer;

import java.util.function.*;

/*
1. dinh nghia :
la 1 khai niem quan trong trong java 8, dong vai tro nen tang cho viec trien khai bieu thuc Lambda va method reference
- la 1 interface trong java chi co duy nhat mot phuong thuc truu tuong (single abstract Method -Sam) nho dac diem nat chung giup code ngan gon
de doc va linh hoat hon trong xu ly logic
@FunctionalInterface
public interface SampleFunctionalInterface {
    void doSomething(); // Single Abstract Method
}
 Giải thích:

@FunctionalInterface
Annotation này dùng để đảm bảo một interface tuân thủ quy tắc của functional interface.
Nếu interface được đánh dấu @FunctionalInterface nhưng chứa nhiều hơn một phương thức trừu tượng, trình biên dịch sẽ báo lỗi.
Annotation này không bắt buộc, nhưng khuyến khích dùng để giúp code rõ ràng và an toàn hơn.
Phương thức void doSomething()
Vì interface chỉ có duy nhất một abstract method, nên SampleFunctionalInterface được coi là một Functional Interface hợp lệ.
2. cac Funtional Interface pho bien
Java 8 cung cap san nhieu funtional Interface trong java.until. functional.Nhung interface nay dc su dung rat thuong xuyen khi ket hop voi
lambda va streamApi
- duoi day la functionnal quan trong
2.1 predicate<T>
- muc dich: kiem tra doi tuong kieu T, tra ve boolean
phuong thuc chinh booleantest(T t)
2.2.Function<T,R>
- muc dich:
Anh xa (transform) mot doi tuong kieu T sang kieu R
phuong thuc chinh R apply(T t)
2.3.Customer<T>
- muc dich :thuc hien 1 hd nao do tren doi tuong kieu T ma ko tra ve ket qua
phuong thuc chinh:void accept(T t)
2.4.Supplier<T>
Mục đích: Cung cấp một giá trị kiểu T mà không cần tham số đầu vào.
Phương thức chính: T get()
2.5. BiFunction<T, U, R>

Mục đích: Nhận hai tham số kiểu T và U, trả về một giá trị kiểu R.
Phương thức chính: R apply(T t, U u)
2.6. UnaryOperator<T>

Mục đích: Nhận một tham số kiểu T và trả về cùng kiểu T.
Đặc biệt: Là trường hợp cụ thể của Function<T, R> khi T và R giống nhau.
Phương thức chính: T apply(T t)
2.7. BinaryOperator<T>

Mục đích: Nhận hai tham số cùng kiểu T và trả về một giá trị kiểu T.
Đặc biệt: Là trường hợp cụ thể của BiFunction<T, U, R> khi T, U, và R đều giống nhau.
Phương thức chính: T apply(T t1, T t2)
// tom lai:
- predicate  -> kiem tra dieu kien(boolean)
-function -> bien doi kieu du lieu T thanh R
- customer -> thuc hien hanh dong ko tra ve
-supplier -> cung cap gia tri ko can input
-biFunction -> nhan 2 input tra ve 1 output
-UnaryOperator & BinaryOperator → Trường hợp đặc biệt của Function và BiFunction.
3. Bieu thuc lamda vs functional interface
- bieu thuc lamda giup khoi tao cac funtional interface mot cach ngan gon va de hieu hon
- thay vi tao lop an danh de trien khai phuong thuc cua functional interface ta co the dung lambda expression de viet code suc tic h va ro rang hon
4.Method  references voi functional interface
- ngoai lamda expression, java 8 con cung cap method reference - mot cach viet ngan gon hon de tham chieu den phuong thuc co san hoac constructor
-method reference la 1 cu phap rut gon cua lamda, khi lam da chi goi lai mot phuong thuc da ton tai
5. Functional Interface và Default Methods
- mac du Functional Interface chi dc phep co mot phuong thuc truu tuong (abtractMethod) nhung no co the chua nhieu defautMethod va static method
-ly do:
default method và static method đã có sẵn phần thân (implementation) → không được tính là abstract.

Do đó, chúng không làm thay đổi bản chất của Functional Interface.

 */
public class JavaFunctionalInterface {
    public static void main(String[] args) {
        // predicate
        Predicate<String>isLonger = str ->str.length() >8;
        System.out.println(isLonger.test("MinhHa"));//false
        // Function<T,R>
        Function<String,Integer>stringLoLength = str -> str.length();
        System.out.println(stringLoLength.apply("Tay Java"));
        // consumer<T>
        Consumer<String> printString =str -> System.out.println(str);
        printString.accept(" Tay Java ");// in ra tay java

        // supper<T>
        Supplier<String> supplier = () -> "Tây Java";
        System.out.println(supplier.get()); // Tây Java
        // BiFunction<T,U,R)
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(3, 5)); // 8

        //UnaryOperator<T>
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(13)); // 169

        //BinaryOperator<T>
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(5, 4)); // 20
        // su dung bieu thuc lamda vs functional Interface
        // cach cu sd lop an danh
        SampleFunctionalInterface oldway = new SampleFunctionalInterface() {
            @Override
            public void doSomething() {
                System.out.println("Cach viet cu ");
            }
        };
        oldway.doSomething();// output cach viet cu
        // cah moi su dung lam da
        SampleFunctionalInterface newWay= ()-> System.out.println("cach viet moi");
        newWay.doSomething();// out put cach viet moi
        

        // su dung bieu thuc lamda
       // su dung method reference
        Function<Integer,String> intToString = String ::valueOf;
        System.out.println(intToString.apply(100));// "100"

    }
}
