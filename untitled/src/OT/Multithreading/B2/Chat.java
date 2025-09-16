package OT.Multithreading.B2;

public class Chat {
    boolean flag=false;
    public synchronized void Question(String msg)
    {
        if (flag)
        {
            try {
                wait();
            }
            catch(InterruptedException e)
            {
                e.fillInStackTrace();
            }
        }
        System.out.println(msg);
        flag=true;
        notify();
    }
    public synchronized void Answer(String msg)
    {
        if(!flag)
        {
            try {
                    wait();
                }
                catch(InterruptedException e)
                {
                    e.fillInStackTrace();
                }
            }
        System.out.println(msg);
        flag=false;
        notify();
        }
    }
