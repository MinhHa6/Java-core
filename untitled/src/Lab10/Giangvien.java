package Lab10;

import javax.xml.namespace.QName;
import java.util.Scanner;

public abstract class Giangvien {
    private String tengiangvien;
    private String Email;
    private String diachi;
    private int dienthoai;

    public Giangvien (){};
    public Giangvien(String tengiangvien, String email, String diachi, int dienthoai) {
        this.tengiangvien = tengiangvien;
        this.Email = email;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
    }
    public abstract double tinhLuong();

    public void input ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten:");
        tengiangvien= scanner.nextLine();
        System.out.println("Nhap email:");
        Email= scanner.nextLine();
        System.out.println("Nhap dia chi:");
        diachi=scanner.nextLine();
        System.out.println("Nhap so dt:");
        dienthoai= scanner.nextInt();
    }
    public  void  display()
    {
        System.out.println("Ten:"+ tengiangvien+"\nEmail:"+Email+"\nDia chi:"+diachi+"\nDienthoai:"+dienthoai);
    }
}
