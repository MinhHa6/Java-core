package Lab03;

import java.util.Scanner;

public class B12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap N:");
        int n=scanner.nextInt();
        System.out.println("Bang cuu chuong");
        for (int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d \n",n,i,(n*i));
        }
    }
}
