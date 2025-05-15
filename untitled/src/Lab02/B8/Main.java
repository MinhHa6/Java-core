package Lab02.B8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam kiem tra nam nhuan:");
        int year =sc.nextInt();
        boolean isLeap= ((year % 4==0 && year %100 !=0) || year %400 ==0 );
        if (isLeap)
        {
            System.out.println("Nam nhuan");
        }
        else {
            System.out.println("Nam ko nhuan");
        }
        System.out.println("Nhap vao thang de kiem tra: ");
        int month = sc.nextInt();
        if (month >=1 && month<=12) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("31 ngay");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 ngay");
                    break;
                case 2:
                    if (isLeap)
                    {
                        System.out.println("29 ngay");
                    }
                    else {
                        System.out.println("28 ngay");
                    }
                    break;
            }
        }
        else {
            System.out.println("Nhap lai thang ");
        }
    }
}
