package core.java8.defaultmethod;

public interface SampleInterface {
    // abtract method
    void abstractMethod();
    //default method
    default void defaultMethod()
    {
        System.out.println("This is a default method in interface ");
    }
}
