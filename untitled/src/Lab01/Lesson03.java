package Lab01;

import java.util.Scanner;

public class Lesson03 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao 3 so nguyen n,m,x:");
        int n =scanner.nextInt(),m=scanner.nextInt(),x=scanner.nextInt();
        int max=n;
        if (m > max) max = m;
        if (x > max) max = x;
        System.out.println("Max cua 3 so la :"+max);
        ///toan tu 3 ngoi
        System.out.println("Max cua 3 so la:"+((n>m)?(n>x?n:x):(m>x?m:x)));
        ///dung ham
        System.out.println("Max cua 3 so la :"+Math.max(n,Math.max(m,x)));
    }
}
