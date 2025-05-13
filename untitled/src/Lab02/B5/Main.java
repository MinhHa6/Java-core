package Lab02.B5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen n can kiem tra:");
        int n= scanner.nextInt();
        if (n%2==0)
        {
            System.out.println("So chan");
        }
        else System.out.println("So le");
    }
}
