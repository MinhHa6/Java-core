package OT.Multithreading.B2;

public class TestThread {
    public static void main(String[] args) {
        Chat m= new Chat();
        new Anna(m);
        new Michael(m);
    }
}
