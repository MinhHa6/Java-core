package Lab03.B10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so n kiem tra :");
        int n = scanner.nextInt();
        int sum=0;
        if (n>0) {
            for (int i =1; i <n;i++)
            {
                if(n%i==0)
                {
                    sum+=i;
                }
            }
            if (sum==n)
            {
                System.out.printf("%d la so hoan hao",n);
            }
            else {
                System.out.println("Ko phai la so hoan hao");
            }
        }
        else System.out.println("Nhap lai n");
    }
}
