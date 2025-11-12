package core.oop.inherritance;
// super Interface
public interface BaseService {
    default void printMessage ()
    {
        System.out.println("Default message from BaseService");
    }
}
