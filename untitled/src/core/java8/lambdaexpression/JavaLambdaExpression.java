package core.java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;

/*
1. Lambda Expression la j
- l a1 tinh nang moi trong Java 8 giup viet code ngan ngon va de doc hon bang cach bieu dien ham function
nhu la mot doi tuong
- hieu don gian :lambda la cach viet ngan gon cua lop an danh khi implement function Interface
2 cu phap
(parameters) -> expression
(parameters) -> {statements;}
parameters: danh sách tham số (có thể bỏ kiểu dữ liệu, Java sẽ suy luận).
->: toán tử lambda (lambda operator).
expression hoặc { statements; }: phần thân (body) của lambda.
3. uu nhuoc diem cua lamda expression
uu diem
+ ngan gon,de doc -> loia bo boilderplate code
- ho tro lap trinh ham trong java (functional programming)
- tich hop tot vs streamapi va collection api
- de dung vs bieu thuc inline ( ko can tao lop rieng)
 nhuoc diem
 - chi ap dung cho functionalInterface interface co dung 1 phuong thuc truu truong
 qua lam dung co the khien code kho debug

 */
public class JavaLambdaExpression {
    public static void main(String[] args) {
        // cac dinh nghia cu
//        SampleFunctionalInterfaces oldWay= new SampleFunctionalInterfaces() {
//            @Override
//            public void sayHello() {
//                System.out.println("Hello Java");
//            }
//
//        };
//        oldWay.sayHello();
//        // dung lambda expression (cach moi gon hon )
//      SampleFunctionalInterfaces neWay = ()-> System.out.println("Hello Java ");
//      neWay.sayHello();
      //  vi du lam da voi tham so
        // dung lamdade dinh nghia phuong thuc add
        Calculator calc = (a,b)->a+b;
        System.out.println(calc.add(5,3));//8
        // lam da trong collection
        List <String> list = Arrays.asList("Java","Python","C++");
        // dung lamda vs foreach
        list.forEach(s -> System.out.println(s));
        // dung method reference(ngan hon nua )
        list.forEach(System.out::println);

    }
}

