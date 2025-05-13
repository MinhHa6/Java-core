package Lab01;

import java.util.Scanner;

public class Lesson1_4 {
    // giai pt bac 2
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap vao 3 so nguyen a,b,c :");
        int a= scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt();
        int delta = b*b -4*a*c;
        if(delta <0)
        {
            System.out.println("pt vo nghiem");
        }
        else if(delta==0)
        {
            System.out.println("Pt co nghiem khep x1=x2="+(-b/(float)2*a));
        }
        else {
            System.out.println("pt co 2 nghiem phan biet:");
            System.out.println("x1="+((-b+Math.sqrt(delta)/(float)2*a)));
            System.out.println("x1="+((-b-Math.sqrt(delta)/(float)2*a)));
        }
    }
}
