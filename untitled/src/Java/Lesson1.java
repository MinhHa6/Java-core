package Java;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello word");
        System.out.println("Nhap mot so tu ban phim:");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(x);
        //ep kieu kko tuong minh
        long lg=100;
        int in=10;
        lg=in;
        //ep kieu tuong minh
        long x1=100;
        int c = (int) x1+5;
        System.out.println(c);
    }

}
