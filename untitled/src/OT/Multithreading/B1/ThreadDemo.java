package OT.Multithreading.B1;

public class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;
    Demo pd;
    ThreadDemo (String name,Demo d)
    {
        threadName=name;
        pd=d;
    }
    public void run()
    {
        synchronized (pd){
            pd.printCount();
        }
        System.out.println("thread"+threadName+"exiting");
    }
    public void start()
    {
        System.out.println("Starting"+threadName);
        if(t==null)
        {
            t= new Thread(this,threadName);
            t.start();
        }
    }

}
