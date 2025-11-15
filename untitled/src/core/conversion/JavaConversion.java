package core.conversion;
/*
Javaconversion la qua trinh chuyen doi du lieu kieu nay sang kieu khac trong java.Day la 1 phan quan trong trong lap trinh t athuong phai:
-ep kieu tu nho sang lon(int- long) hoac nguoc lai (double -int)
- chuyen doi kieu du lieu nguyen thuy (primitive)  va doi doi tuong (wrapper class)\
- chuyen doi giua string va cac kieu du lieu khac
1.Type casting (ep kieu du lieu )
-widening (implicit connversion): tu dong chuyen nho sang lon
int  a=10;
double b=a;// int -> double (tu dong)
-Narrowing(explicit Conversion)
can ep kieu thu cong khi chuyen kieu lon sang nho
double x=9.78
int y =(int) x;// double ->int(mat phan thap phan)
2.Autoboxing & unboxing
-AutoBoxing :chuyen primitive thanh wrapper
-unboxing:chuyen wraper ve primitive
int a= 5;
Interger obj= a;// autoboxing (int ->Integer)
int b= obj;// unboxing (Interger ->int)
3. String Conversion
- chuyen kieu du lieu -> String
int num=100;
String  str1= String.valueOf(num);
String str2= Integers.toString(num)
-Chuyen string -> kieu du lieu
String s = "200";
int i = Integer.parseInt(s);   // "200" → 200
double d = Double.parseDouble("3.14");
4.Object conversion
trong oop co the chuyen doi kieu du lieu cha(superClass) va kieu con(subClass)
-upcasting(ngamdinh):Subclass ->Superclass
-downcasting(tuongminh) :SuperClass ->subclass
 Class Animal {}
 class Dog extends Animals {}
Aninal a = new Dog {} // upcasting
Dog d =(Dog) a;
 */
public class JavaConversion {
}
