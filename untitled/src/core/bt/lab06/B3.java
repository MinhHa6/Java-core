package core.bt.lab06;

import java.util.Scanner;

// nhap mang co n phan tu cac nguyen to , In ra cac phan tu la so nguyen cua mang
public class B3 {
    static  boolean soNguyenTo(int n)
    {
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap n phan tu cua mang:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        // in ra cac so nguye to
        for (int i=0;i<n ;i++)
        {
            if(soNguyenTo(arr[i]))
            {
                System.out.println(arr[i]+" ");
            }
        }
    }
}
