package core.bt.lab8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiangVien []ds =null;
        while (true)
        {
            System.out.println("===== Menu======");
            System.out.println("1.Nhap vao thong tin cua giang vien ");
            System.out.println("2.Xuat ds toan bo giang vien ");
            System.out.println("3.Xuat ds giang vien huu co");
            System.out.println("4.Xuat ds giang vien thinh giang");
            System.out.println("5. Tinh tong tien luong cua toan bo giang vien ");
            System.out.println("6. Tim Giang vien co tong luong cao nhat ");
            System.out.println("Nhap lua chon:");
            int choice= sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    ds= new GiangVien[3];
                    for (int i=0;i<ds.length;i++)
                    {
                        System.out.println("Chon giao vien 1.Co huu || 2. Thinh giang");
                        int type=sc.nextInt();
                        sc.nextLine();
                        if(type==1){
//                            ds[i]= new GVCoHuu();
                        }
                        else {
                            ds[i].input();
                        }
                    }
                    break;
                case 2:
                    if (ds ==null)
                    {
                        System.out.println("chua co du lieu ");
                    }
                    for(GiangVien gv:ds) {
                        gv.display();
                    }
                    break;
                case 3:
                    if (ds == null) { System.out.println("Chua co du lieu"); break; }
                    for (GiangVien gv : ds)
                        if (gv instanceof GVCoHuu) gv.display();
                    break;

                case 4:
                    if (ds == null) { System.out.println("Chua co du lieu"); break; }
                    for (GiangVien gv : ds)
                        if (gv instanceof GVTG) gv.display();
                    break;

                case 5:
                    if (ds == null) { System.out.println("Chua co du lieu"); break; }
                    double tong = 0;
                    for (GiangVien gv : ds) tong += gv.tinhLuong();
                    System.out.println("Tong tien luong: " + tong);
                    break;

                case 6:
                    if (ds == null) { System.out.println("Chua co du lieu"); break; }
                    GiangVien max = ds[0];
                    for (GiangVien gv : ds)
                        if (gv.tinhLuong() > max.tinhLuong()) max = gv;

                    System.out.println("Giang vien co luong cao nhat:");
                    max.display();
                    break;

                case 7:
                    System.out.println("Thoat...");
                    return;

                default:
                    System.out.println("Chon sai! Nhap 1-7.");

            }
        }
    }
}
