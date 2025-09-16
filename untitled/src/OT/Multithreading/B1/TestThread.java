package OT.Multithreading.B1;

public class TestThread {
    public static void main(String[] args) {
        Demo pd= new Demo();
        ThreadDemo T1= new ThreadDemo("Thread-1",pd);
        ThreadDemo T2 = new ThreadDemo("Thread-2",pd);
        T1.start();
        T2.start();
        // wait for threads to end;
        try{
            T1.join();
            T2.join();
        }
        catch (Exception e)
        {
            System.out.println("Interrupted");
        }
    }
}
