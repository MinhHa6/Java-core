package Lab10;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Giangvien> dsgiangvien= new ArrayList<>();
        System.out.println("Nhap so thong tin giang vien:");
        int n= scanner.nextInt();
        scanner.nextLine();
        CoHuu [] ch= new CoHuu[n];
        ThinhGiang []tg= new ThinhGiang[n];
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
                    System.out.println("=====Giang vien co huu=====");
                    for (int i=0;i<ch.length;i++)
                    {
                        System.out.println("Giang vien co huu "+(i+1)+":");
                        ch[i]= new CoHuu();
                        ch[i].input();
                    }
                    System.out.println("=====Giang vien Thinh Giang=====");
                    for (int i=0;i<ch.length;i++)
                    {
                        System.out.println("Giang vien thinh Giang "+(i+1)+":");
                        tg[i]= new ThinhGiang();
                        tg[i].input();
                    }
                case 2:
                    System.out.println("Giang vien co Huu");
                    for (CoHuu coHuu:ch)
                    {
                        if(coHuu!=null)
                        {
                            coHuu.display();
                        }
                    }
                    System.out.println("=====Giang vien Thinh Giang======");
                    for (ThinhGiang thinhGiang:tg)
                    {
                        if(thinhGiang!=null)
                        {
                            thinhGiang.display();
                        }
                    }
            }
        }
    }
}
