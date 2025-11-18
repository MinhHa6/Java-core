package core.java8.methodreferences;

import Lab04.B2.Customer;

import java.util.function.Consumer;
import java.util.function.Supplier;

/*
- method references la 1 tinh nang moi trong java 8 cho phep ban tham chieu truc tiep den mot phuong thuc hoac constructor thay vi phai viet toan bo bieu thuc lambda
1. dac diem chinh
- ngan gon hon lamda :ko can viet x -> someMethod(x) nua, chi can viet className :: method Name
- co the tham chieu
- phuong thuc static
- phuong thuc instance (cua doi tuong cu the hoac cua bat ky doi tuong nao kieu do )
constructor(new)
- chi dung khi lamda chi goi laij 1 phuong thuc co san
2 cu phap co ban
ClassName::staticMethod
objectReference::instanceMethod
ClassName::instanceMethod
ClassName::new
vi du tham chieu dcen phuong thuc static
vd:tham chieu den constructor
vidu:Method References với Functional Interface
 */
public class JavaMethodReferences {
    public static  void printMsg(String msg)
    {
        System.out.println(msg);
    }

    public static void main(String[] args) {
//        // dung lamda
//        Customer<String>lambdaWay =s -> JavaMethodReferences.printMsg(s);
//        lambdaWay.accept("hello Lamda");
        // Dùng method reference
        Consumer<String> refWay = JavaMethodReferences::printMsg;
        refWay.accept("Hello Method Reference");
        // vidu tham chieu den phuong thuc instance cua mot object
        // dung lamda
        String str = "Vu Minh Ha";
        Supplier<Integer>lanbdaWay= () ->str.length();
        // dung method reference
        Supplier<Integer>  reWay =str::length;
        System.out.println(lanbdaWay.get());
//        System.out.println(refWay.get());
    }
}
