package core.bt.lb2;

import java.awt.*;
import java.util.Scanner;

public class XeMay {
    private  String ten;
    private String nhaSanXuat;
    private  int soLuongBanhXe;
  public   void nhapThongTin()
  {
      System.out.println("Nhap thong tinh xe");
      Scanner sc= new Scanner(System.in);
      System.out.println("Nhap ten xe:");ten=sc.nextLine();
      System.out.println("Nhap nha san xuat:");nhaSanXuat=sc.nextLine();
      System.out.println("Nhap so luong banh xe:");soLuongBanhXe=sc.nextInt();
  }
  // ham hien thi thong tin

    @Override
    public String toString() {
        return "XeMay{" +
                "ten='" + ten + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                ", soLuongBanhXe=" + soLuongBanhXe +
                '}';
    }
}
