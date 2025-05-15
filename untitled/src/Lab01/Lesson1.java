package Lab01;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello,this is my first Appliation");// bai1
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so nguyen n:");
        int n=sc.nextInt();// bai 2
        System.out.println("Nhap so nguyen n:");
        int nn= sc.nextInt();
        System.out.println("Nhap so thuc m:");
        float m= sc.nextFloat();// bai3
        System.out.println("Nhap 1 so nguyen n:");
        int nnn= sc.nextInt();
        System.out.println("Nhap 1 so thuc n:");
        float mn=sc.nextFloat();
        // Xử lý lỗi khi chuyển từ nhập số sang nhập chuỗi
        sc.nextLine(); // đọc bỏ dòng trống còn lại

        System.out.println("Nhap 1 xau ky tu:");
        String kt=sc.nextLine(); //bai4
        System.out.println("Nhap 2 so nguyen n,m :");
        int xn=sc.nextInt();
        int xm=sc.nextInt();
        System.out.println("Tong cua 2 so n va m la :"+(xn+xm));//bai 5

    }
}
