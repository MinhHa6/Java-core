package core.bt.lb2;

import java.util.Scanner;

public class B8 {
    // viet chuong tirnh nhap vao thang in ra ngay
    public static void main(String[] args) {
        System.out.println("Nhap vao thang tu 1 den 12 :");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        switch (n)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("30");
                break;
            case 4: case 6: case 9: case 11:
            System.out.println("30 ngay");
            break;
            case 2:
                System.out.println("Nhap nam de xem 28 hay 29 ngay:");
                int year=sc.nextInt();
                if(year %400==0)
                {
                    System.out.println("28");
                }
                else
                {
                    System.out.println("29");
                }
                break;
            default:
                System.out.println("Nhap lai gia tri kiem tra");
        }
    }
}
