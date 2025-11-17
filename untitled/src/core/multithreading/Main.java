package core.multithreading;

public class Main {
    public static void main(String[] args) {
        TestThread thread1 = new TestThread();
        thread1.start();
        // tao Thread bnag cach cai dat runnable
        TestRunnable runnable= new TestRunnable();
        Thread thread= new Thread(runnable);
        thread.start();
    }
}
