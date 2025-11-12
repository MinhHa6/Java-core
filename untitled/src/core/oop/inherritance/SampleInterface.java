package core.oop.inherritance;

import java.time.LocalDateTime;

public interface SampleInterface {
    // constance fields
    String name ="Tay Java";
    // abstract methods
    void method1();
    int method();
    String methodN();
    // default Method
    default void sayHello ()
    {
        System.out.println("Day la sample interface");
    }
    // static method
    static String getCurrentTime()
    {
        return String.valueOf(LocalDateTime.now());
    }
}
