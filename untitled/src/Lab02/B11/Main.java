package Lab02.B11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen x va y:");
        int x=scanner.nextInt(),y=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap toan tu can thuc hien:");
        String toantu=scanner.nextLine().toUpperCase();
        switch (toantu)
        {
            case "+":
            System.out.println(x+y);
            break;
            case "-":
            System.out.println(x-y);
            break;
            case "*":
            System.out.println(x*y);
            break;
            default:
                System.out.println(x/y);
                if (y==0)
                {
                    System.out.println("ko chia dc");
                }
        }
    }
}
