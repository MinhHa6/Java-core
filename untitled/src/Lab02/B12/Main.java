package Lab02.B12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao diem cua 3 Ly-Hoa-Sinh:");
        float Ly=sc.nextFloat(),Hoa=sc.nextFloat(),Sinh=sc.nextFloat();
        float sum=Ly+Hoa+Sinh;
        if (sum>=15)
        {
            if (Ly>=4 && Hoa>=4 && Sinh >=4)
            {
                System.out.println("Dau");
                if (Ly>=5 && Hoa>=5 && Sinh >=5)
                {
                    System.out.println("Hoc deu tat ca cac mon");
                }
                else {
                    System.out.println("Hoc ko deu");
                }
            }
        }
    }
}
