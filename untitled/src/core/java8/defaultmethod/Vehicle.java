package core.java8.defaultmethod;

public interface Vehicle {
    void start();// abstract method
    default void stop (){
        System.out.println("Vehicle is stopping...");
    }
}
