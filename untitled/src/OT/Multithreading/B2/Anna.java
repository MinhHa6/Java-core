package OT.Multithreading.B2;

public class Anna implements Runnable{
    Chat m;
    String []s1={"Hi","how are you","I am also doing fine!"};
    public Anna (Chat m1)
    {
        this.m=m1;
        new Thread(this,"Questions").start();
    }
    public void run ()
    {
        for(int i=0;i<s1.length;i++)
        {
            m.Question(s1[i]);
        }
    }
}
