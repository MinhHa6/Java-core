package core.bt.lb2;

import java.util.Scanner;

public class B13 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so h lam viec:");int hLam=scanner.nextInt();
        System.out.println("Nhap luong theo h :");double hLuong=scanner.nextDouble();
        double tongluong;
        if(hLam>40)
        {
            tongluong=(hLam-40)*1.5*hLuong + 40*hLuong;
        }
        else {
            tongluong=hLuong*hLam;
        }
        System.out.println("Tong luong cua nhan vien la:"+tongluong);
    }
}
