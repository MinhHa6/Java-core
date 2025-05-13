package Lab01;

import java.util.Scanner;

public class Lesson1_3 {
    public static void main(String[] args) {
        ////giai pt bac nhat
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap 2 so a va b:");
        int a = scanner.nextInt(),b=scanner.nextInt();
        if (a==0)
        {
            if (b==0)
            {
                System.out.println("pt co vo so nghiem");
            }
            else System.out.println("pt vo nghiem");
        }
        else
        {
            System.out.println("Pt co nghiem duy nhat la:"+(-b/(float)a));
        }
    }
}
