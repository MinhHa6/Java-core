package core.oop;

import java.util.Date;

public class OOP {
    /*
    oop la mot mo hinh lap trinh cung cap nhieu khai niem nhu doi tuong,ke thua, rang buoc du lieu da hinh
    doi tuong co nghia la mot thuc the trong the gioi thuc nhu con nguoi do vat  hay su kien
    lap trinh huong doi tuong la 1 phuong phapo luan hoac mo hinh de thiet je phan mem bang cach su dung cac lop doi tuong.No don gian hoa bang viec bao tri va phat trien phan mem
    bang cach cung cap mot so khai niem
    oject :doi tuong co 3 dac diem la :state(trang thai) behavior(hanh vi),Identity (nhandang)
    class :lop la mot nhom cac doi tuong co thuoc tinh chung.Bao gom fields(cac truong),Method(phuong thuc),constructor(khoi tao),Blocks(khoi),Lop nong nhau va giao dien
    cu phap : <public|protected> class <classname>{// begin block
    //fields cac truogn
    // method :cac truong
    //constructor :khoi tao} end block
    inheritance : ke thua
    polymorphism: da hinh
    Abstraction :truu tuong
    enscapsulation :dong goi
    - bien instance variable trong java.Mot bien dc dao ben tron lop nhung ben ngoai phuong thuc goi la instance .instance khong nhan dc bo
    nho tai thoi diem bien dich .No nhan dc bo nho tai thoi diem chay khi doi tuong hoac instan ce dc tao ra.vi the no dc goi la instance
    -method Java :trong Java phuong thuc giong nhu ham dc su dung de bieu dien hanh vi cua doi tuong behavior .vs phuong thuc chung ta co the tai su dung code hoac tuy chinh de dang
    4. So sanh object vs class
    mot class la mot mau hoac ban thiet ke de mo ta cac thuc the huu hinh hoac vo hinh trong the gioi that con object la ban ssao huu hinh cua class tao ra
    tai thoi diem runtime cua ung dung.nhu vay co the no object la 1 instance cua class
    Co 3 cach khoi tao cua doi tuong
    khoi tao doi tuong qua bien tham chieu
    khoi tao doi tuong qua bien method(phuong thuc)
    khoi tao doi tuong thong qua constructor
     */
    public static void main(String[] args) {
        //tu khoa new dc du dung de phan bo bo nho khi chay .Tat ca cac doi tuong deu co bo nho trong vung heap
        User user= new User();

        // khoi tao doi tuong thong qua bien tham chieu (reference variable)
        user.message="Xin chao";
        System.out.println(user.message);
        // khoi tao doi tuong qua bien method (phuong thuc)
        user.setId(1);
        user.setFirstName("Minh");
        user.setLastName("Ha");
        System.out.println(user);
        // khoi tao doi tuong thong qua constructor
        User someone= new User(2,"Ha","Minh",new Date());
        System.out.println(someone);
    }
}
