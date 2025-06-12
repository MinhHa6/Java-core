package Java.Lesson09;

public class Main {
    /*
    //I.interface
    field:static/filnal
    method:phuong thuc truu tuong ko than luon luon la public
    thuc thi:implement nhieu interface khac
    dat ten:bat dau bang chu I
    class thuc thi interface :nhung class phai overide toan bo interface
    II.astract class
    filed; su dung binh thuong
    method:co the phuong thuc binhthuong va vua co phuong thuc truu tuong
    de su dung duoc phuongthuc truu tuong thi phai co  botu astract
    III.Nested lop trong lop
    lop con chi su dung trong lop cha
    IV.Lop an danh
     */
    public static void main(String[] args) {
        Animal animal = new Animal("Ngua",4);
        animal.show();
        Herbivore herbivore=new Herbivore("De",4,5);
        herbivore.show();
    }

}
