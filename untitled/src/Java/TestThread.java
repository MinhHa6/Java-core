package Java;

public class TestThread {
    public static void main(String[] args) {
        MyThread objectThread= new MyThread();//
        objectThread.setName("thread1");
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(objectThread.isAlive());
        objectThread.start();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(objectThread.isAlive());
    }
}
