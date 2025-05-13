package Lab01;

import java.util.Scanner;

public class Lesson1_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen n,m:");
        int n=scanner.nextInt(),m=scanner.nextInt();
        if (n>m)
        {
            System.out.println("Max la:"+n);
        }
        else
        {
            System.out.println("Max:"+m);
        }
        ///// toi uu hon
        System.out.println("Max cua 2 so la:"+(n>m ? n:m));
        /// su dung ham
        System.out.println("Max cua 2 so la "+Math.max(n,m));
    }
}
