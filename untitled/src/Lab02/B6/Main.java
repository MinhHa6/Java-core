package Lab02.B6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 3 so nguyen a,b,c:");
        int a=scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt();
        if (a >0 && b>0 && c>0)
        {
            if((a+b)>c && (a+c)>b && (b+c)>a) {
                System.out.println("Hinh tam giac");
                System.out.println("Chu vi hinh tam giac la:"+(a+b+c));
                System.out.println("Nhap chieu cao cua tam giac:");
                int h=scanner.nextInt();
                System.out.println("Dien tich hinh tam giac la:"+(0.5*a*h));
            }
        }
        else
        {
            System.out.println("Khong phai hinh tam giac");
        }

    }
}
