package Lab10;

import java.util.Scanner;

public class CoHuu extends Giangvien{
    private int sogiogiangdaytrongthang;
    private double luongthoathuan;
    private final float sohquydinhtrongthang=40;
    public CoHuu ()
    {
        super();
    }
    public CoHuu(String tengiangvien, String email, String diachi, int dienthoai,int hday,double luong,float sohquydinh) {
        super(tengiangvien, email, diachi, dienthoai);
        this.sogiogiangdaytrongthang=hday;
        this.luongthoathuan=luong;
    }
    @Override
    public  void input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giao vien co huu");
        super.input();
        scanner.nextLine();
        System.out.println("So gio day trong thang:");
        sogiogiangdaytrongthang=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Luong thoa thuan:");
        luongthoathuan= scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public double tinhLuong() {
        if (sogiogiangdaytrongthang <= sohquydinhtrongthang)
            return luongthoathuan;
        else
            return luongthoathuan + (sogiogiangdaytrongthang - sohquydinhtrongthang) * 200000;
    }
    @Override
    public void display ()
    {
        super.display();
        System.out.println("\nSo h day trong thang:"+sogiogiangdaytrongthang+
                "\n Luong thoa thuan:"+luongthoathuan+"\n Luon tinh:"+tinhLuong()
        );
    }
}
