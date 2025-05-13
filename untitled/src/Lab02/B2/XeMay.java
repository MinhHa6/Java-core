package Lab02.B2;

import java.util.Scanner;

public class XeMay {
    private String name;
    private String nhaSanXuat;
    private int soLuongBanhxe;
    public void nhapThongTin()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap ten xe:");
        this.name =scanner.nextLine();
        System.out.println("Nhap nha san xuat:");
        this.nhaSanXuat=scanner.nextLine();
        System.out.println("Nhap so luong banh xe :");
        this.soLuongBanhxe=scanner.nextInt();
    }
    public void hienThiThongTin()
    {
        System.out.println("-----------Thong tin xe --------");
        System.out.println("Ten xe:"+name);
        System.out.println("Nha san xuat:"+nhaSanXuat);
        System.out.println("So luong banh xe:"+soLuongBanhxe);
    }
}
