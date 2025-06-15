package Lab10.B1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Giangvien> dsgiangvien= new ArrayList<>();
        ArrayList<CoHuu>coHuus= new ArrayList<>();
        ArrayList<ThinhGiang>thinhGiangs= new ArrayList<>();
        System.out.println("Nhap so thong tin giang vien:");
        scanner.nextLine();
        CoHuu ch;
        ThinhGiang tg;
        Giangvien gv;
        while (true)
        {
            System.out.println("=====Menu======");
            System.out.println("1.Nhap vao thong tin cua Giang vien");
            System.out.println("2.Xuat danh sach toan bo giang vien");
            System.out.println("3.Xuat danh sach giang vien co huu");
            System.out.println("4.Xuat danh sach giang vien thinh giang");
            System.out.println("5.Tinh tong so tien luong cua toan bo giang vien");
            System.out.println("6.Tim giang vien co tong luong cao nhat");
            int choice =scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.println("1:cohuu || 2.Thinh giang ");
                    int chon =Integer.parseInt(scanner.nextLine());
                    if(chon==1)
                    {
                        gv = new CoHuu();
                        gv.input();
                        dsgiangvien.add(gv);
                    }
                    else if (chon==2)
                    {
                        gv = new ThinhGiang();
                        gv.input();
                        dsgiangvien.add(gv);
                    }
                    break;
                case 2:
                    for(Giangvien ds:dsgiangvien)
                    {
                        if(ds!= null)
                        {
                            ds.display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Giang vien co Huu");
                    for (CoHuu coHuu:coHuus)
                    {
                        if(coHuu!=null)
                        {
                            coHuu.display();
                        }
                    }
                case 4:
                    System.out.println("=====Giang vien Thinh Giang======");
                    for (ThinhGiang thinhGiang:thinhGiangs)
                    {
                        if(thinhGiang!=null)
                        {
                            thinhGiang.display();
                        }
                    }
                    break;
                case 5:
                    double tong=0;
                    for (Giangvien g:dsgiangvien)
                    {
                        tong+=g.tinhLuong();
                    }
                    System.out.println("Luong toan bo nhan vien :"+tong);
                    break;
                case 6:
                    Giangvien max = null;
                    double maxLuong = -1;
                    for (Giangvien g : dsgiangvien) {
                        double l = g.tinhLuong();
                        if (l > maxLuong) {
                            maxLuong = l;
                            max = g;
                        }
                    }
                    if (max != null) {
                        System.out.println("Giang vien co luong cao nhat:");
                        max.display();
                    }
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        }
    }
}
