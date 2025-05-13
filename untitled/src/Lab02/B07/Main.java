package Lab02.B07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 4 so nguyen a,b,c,d:");
        int a =scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt(),d=scanner.nextInt();
        System.out.println("So nguyen lon nhat trong 4 so la: " +
                (((a > b ? a : b) > (c > d ? c : d)) ? (a > b ? a : b) : (c > d ? c : d)));
    }
}
