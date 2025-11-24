package core.bt.lab8;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
    private double luongThoaThuan;
    private  int sohquyding=40;


    public GVCoHuu(String nameGv, String email, String diachi, int sdt, float soGioGiangDay, double luongThoaThuan) {
        super(nameGv, email, diachi, sdt, soGioGiangDay);
        this.luongThoaThuan=luongThoaThuan;
    }
    @Override
    public void input()
    {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Nhap luong thoa thuan:");
        luongThoaThuan=scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public void display()
    {
        System.out.println("====Co huu====");
        super.display();
        System.out.println("Luong thoa thhuan:"+luongThoaThuan);
    }
    @Override
    public double tinhLuong()
    {
        if (soGioGiangDay > sohquyding) {
            return luongThoaThuan + (soGioGiangDay - sohquyding) * 200000;
        }
        return luongThoaThuan;

    }
}
