package core.bt.lab06;

import java.util.Random;
import java.util.Scanner;

// nhap mang co n phan tu nhap thu cong
// nhap 1 mang co 10 phan tu cac so nguyen, hien thi mang vu anhap ra man hinh
// nhap tu dong dung random mang co 10 phan tu
public class B1 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        Random r = new Random();
        int arrs[]=new int[3];
        for (int i=0;i<arrs.length;i++)
        {
            arrs[i]=r.nextInt(100);
            System.out.println(arrs[i]);
        }

        System.out.println("Nhap n phan tu cua  mang :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arrss[] = new int[n];
        for (int i=0;i<arrss.length;i++ )
        {
            System.out.println(arrss[i]);
        }
    }
}
