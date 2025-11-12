package core.bt.lb2;

import java.util.Scanner;

public class SinhVien {
    private String ten;
    private String ma;
    private float diemLyThuyet;
    private float diemThucHanh;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien:");ten=sc.nextLine();
        System.out.println("Nhap ma sinh vien:");ma=sc.nextLine();
        System.out.println("Nhap diem ly thuyet:");diemLyThuyet=sc.nextFloat();
        System.out.println("Nhap diem thi thuc hanh:");diemThucHanh=sc.nextFloat();
        if(diemLyThuyet<4)
        {
            System.out.println("Thi lai ly thuyet");
        }
       else if(diemThucHanh< 4)
        {
            System.out.println("thi lai thuc hanh ");
        }
        float dtb=(diemLyThuyet+diemThucHanh)/2;
        if(dtb <4)
        {
            System.out.println("Sinh vien hoc lai");
        }
        else if(dtb >=4 && dtb <=7)
        {
            System.out.println("Sinh vien dat mon Java");
        }
        else if(dtb >7)
        {
            System.out.println("Sinh vien xuat sac mon Java");
        }

    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", ma='" + ma + '\'' +
                ", diemLyThuyet=" + diemLyThuyet +
                ", diemThucHanh=" + diemThucHanh +
                '}';
    }
}
