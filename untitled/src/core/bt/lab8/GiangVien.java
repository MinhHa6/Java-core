package core.bt.lab8;

import java.util.Scanner;

public abstract class GiangVien {
    private String nameGv;
    private String email;
    private String diachi;
    private int sdt;
    private float soGioGiangDay;

    public GiangVien(String nameGv, String email, String diachi, int sdt, float soGioGiangDay) {
        this.nameGv = nameGv;
        this.email = email;
        this.diachi = diachi;
        this.sdt = sdt;
        this.soGioGiangDay = soGioGiangDay;
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten giang vien:");
        nameGv=sc.nextLine();
        System.out.println("Nhap email giang vien:");
        email=sc.nextLine();
        System.out.println("Nhap dia chi:");
        diachi=sc.nextLine();
        System.out.println("Nhap so dt:");
        sdt=sc.nextInt();
        System.out.println("Nhap so h lam cua giang vien:");
        soGioGiangDay=sc.nextFloat();
        sc.nextLine();
    }
    public void display()
    {
        System.out.println("Ten:"+nameGv+"||"+"Email:"+email+"||"+
                "Diachi:"+diachi+"||"+"Sdt:"+sdt+"||"+"So gio lam trong thang:"+soGioGiangDay);
    }
    public abstract double tinhLuong();

}
