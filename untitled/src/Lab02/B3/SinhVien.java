package Lab02.B3;

import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String tenSV;
    private float diemLyThuyet;
    private float diemThucHanh;
    public void nhapThongTin()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien:");
        this.maSV=scanner.nextLine();
        System.out.println("Nhap ten sinh vien:");
        this.tenSV= scanner.nextLine();
        System.out.println("Nhap diem ly thuyet:");
        this.diemLyThuyet=scanner.nextFloat();
        System.out.println("Nhap diem thuc hanh:");
        this.diemThucHanh=scanner.nextFloat();
    }
    public void xepLoai()
    {
        float dtb=(diemLyThuyet+diemThucHanh)/2;
        if(diemLyThuyet <4)
        {
            System.out.println("Thi lai ly thuyet");
        }
        else if(diemThucHanh <4)
        {
            System.out.println("Thi lai diem thuc hanh");
        } else if (dtb<4) {
            System.out.println("sinh vien phai hoc lai");
        } else if (dtb>=4 && dtb <=7) {
            System.out.println("Sinhvien dat mon Java");
        }
        else System.out.println("Sinh vien xuat sac mon Java");
    }
    public void hienthi()
    {
        System.out.println("---------Thong tin sinh vien-------");
        System.out.println("Masv:"+maSV);
        System.out.println("Ten sinh vien:"+tenSV);
        System.out.println("Diem Ly thuyet"+diemLyThuyet);
        System.out.println("Diem thuc hanh:"+diemThucHanh);
        System.out.println("Xep loai:");
        xepLoai();
    }
}
