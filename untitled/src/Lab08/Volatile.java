package Lab08;

public class Volatile extends  Thread{
        volatile boolean keepruning =true;
        public void run()
        {
            long count =0;
            while (keepruning)
            {
                count++;
            }
            System.out.println("Thread running:"+count);
        }

    public static void main(String[] args) throws InterruptedException {
        Volatile volatile1= new Volatile();
        volatile1.start();
        Thread.sleep(1);
        volatile1.keepruning=false;
        System.out.println("keep running set to false");
    }
}
