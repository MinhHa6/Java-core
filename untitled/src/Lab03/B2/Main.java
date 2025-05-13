package Lab03.B2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap vao n:");
        int n= scanner.nextInt();
        int sum=0;
        for (int i=1;i<n;i++)
        {
            sum+=i;
        }
        System.out.println("Tong:"+sum);
    }
}
