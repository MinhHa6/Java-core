package Lab02.B13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap so gio lam:");
        float h=scanner.nextFloat();
        System.out.println("Nhap luong theo h:");
        float luong=scanner.nextFloat();
        float gioTangCa=h-40;
        float  tongLuong = h * luong;
        double   tongluongcatangca = 40 *luong + gioTangCa * luong * 1.5;

        if (h<=40)
        {
            System.out.println("Tong luong nhan duoc la:"+tongLuong);
        }
        else
        {
            System.out.println("tong ca luong tang ca va luong theo h la :"+tongluongcatangca);
        }
    }
}
