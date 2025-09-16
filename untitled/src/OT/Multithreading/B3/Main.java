package OT.Multithreading.B3;

public class Main {
    public static void main(String[] args) {
        ThayDoChao thayDo= new ThayDoChao();
        XaTruongChao xaTruong= new XaTruongChao();
        thayDo.start();
        xaTruong.start();
    }
}
