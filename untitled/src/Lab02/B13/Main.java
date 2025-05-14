package Lab02.B13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap so gio lam:");
        float h=scanner.nextFloat();
        System.out.println("Nhap luong theo h:");
        float luong=scanner.nextFloat();
        double tongLuong;

        if (h<=40)
        {
            tongLuong=luong *h;
        }
        else
        {
            float htangca= h-40;
            tongLuong=40*luong+luong*htangca*1.5;
        }
        System.out.println(tongLuong);
    }
}
