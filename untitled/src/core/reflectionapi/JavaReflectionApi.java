package core.reflectionapi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
1.Java Reflection Api
- trong java co mot co che cho phep chuong trinh quan sat va thao tac dong (runtime) tren class, interface, field,method ma ko can bt chinh
xac chung tai thoi diem bien dich(compile-time)
-noi cach khac,reflection cho phep ban
-lay thong tin class(ten class,modifiers,superclass,interface)
truy cao thay doi fields (bien) cua doi tuong
goi method (ke ca private method) trong runtime
-tao doi tuong tu classname khi chi bt ten chuoi
Frameworks (Spring, Hibernate…) dùng Reflection để inject dependency, ánh xạ dữ liệu DB ↔ Object.
IDE / Tools: Kiểm tra code, gợi ý method, autocomplete.
Testing frameworks (JUnit): Gọi các method test annotated bằng @Test.
Serialization / Deserialization: Chuyển đổi object thành JSON/XML hoặc ngược lại.
 */
public class JavaReflectionApi {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Person");

        // Tạo đối tượng Person
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // Truy cập field private "name"
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(obj, "Tây Java");

        // Gọi method sayHello()
        Method method = clazz.getDeclaredMethod("sayHello");
        method.invoke(obj);
    }
}
