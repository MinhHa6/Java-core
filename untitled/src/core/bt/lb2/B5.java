package core.bt.lb2;

import java.util.Scanner;

public class B5 {
    // nhap 1 so nguyen n kiem tra so do chan hay le
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so nguyen N:");int n=sc.nextInt();
        String  result = (n % 2 ==0) ? "So chan":"So le";
        System.out.println(result);
    }
}
