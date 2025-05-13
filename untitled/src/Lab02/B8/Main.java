package Lab02.B8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam kiem tra nam nhuan:");
        int year =sc.nextInt();
        if((year %4 ==0 && year %100 !=0)|| (year %400 ==0))
        {
            System.out.println("Nam nhuan");
        }
        else {
            System.out.println("Nhap thang de kiem tra:");
            int month= sc.nextInt();
            if (month >=1 && month<=12)
            {
                switch (month)
                {
                    case 1:
                        System.out.println("30 ngay");
                        break;
                    case 2:
                        System.out.println("28 ngay");
                        break;
                    case 3:
                        System.out.println(" 30 ngay");
                        break;
                }
            }
            else {
                System.out.println("nhap lai thang sao cho hop le");
            }
        }
    }
}
