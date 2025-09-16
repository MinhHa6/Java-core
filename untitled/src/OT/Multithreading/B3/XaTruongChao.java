package OT.Multithreading.B3;

import static OT.Multithreading.B3.ChaoHoi.ThayDo;
import static OT.Multithreading.B3.ChaoHoi.XaTruong;

public class XaTruongChao extends Thread{
    public  void run() {
        synchronized (XaTruong) {
            System.out.println("Xa truong :Cui nguoi chao...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Xa truong:doi thay do chao lai...");
            synchronized (ThayDo) {
                System.out.println("Xa truong:ket thuc chao hoi ...");
            }
        }
    }
}
