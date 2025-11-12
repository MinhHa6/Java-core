package core.bt.lb2;

import java.util.Scanner;

public class B6 {
    // kiem tra co phai hinh tam giac hay ko.Tinh dien tich va chu vi cua hinh
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so do cua a,b,c de kiem tra:");
        int a= sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
        String kt = (((a + b) > c) && ((a + c) > b) && ((b + c) > a))
                ? "hinh tam giac"
                : "Ko phai hinh tam giac";
        System.out.println(kt);
        double p = (a + b + c) / 2.0;
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        double chuVi = a + b + c;

        System.out.println("Chu vi = " + chuVi);
        System.out.println("Dien tich = " + dienTich);
    }
}
