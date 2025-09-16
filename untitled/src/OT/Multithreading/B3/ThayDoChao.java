package OT.Multithreading.B3;

import java.util.concurrent.ThreadLocalRandom;

import static OT.Multithreading.B3.ChaoHoi.ThayDo;
import static OT.Multithreading.B3.ChaoHoi.XaTruong;

public class ThayDoChao extends Thread{
    public void run()
    {
        synchronized (ThayDo)
        {
            System.out.println("Thay do :Cui nguoi chao....");
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {

            }
            System.out.println("Thay do doi xa truogn chao lai ....");
            synchronized (XaTruong){
                System.out.println("Thay Do :ket thuc chao hoi...");
            }
        }
    }
}
