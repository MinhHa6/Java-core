package Lab01;

import java.util.Scanner;

public class Lesson1_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen n1 va m1 :");
        int n1 =scanner.nextInt(),m1=scanner.nextInt();
        System.out.println("Nhap 2 so thuc n2 va m2:");
        double n2=scanner.nextDouble(),m2=scanner.nextDouble();
        System.out.println("Tong cua 2 so n1 va n2 la :"+(n1+n2));
    }
}
