package Lab06.B5;

import java.util.Random;
import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Random random = new Random();
        System.out.println("Nhap n phan tu trong mang:");
        int n= scanner.nextInt();
        int [] arr= new int[n];

        for (int i=0;i<arr.length;i++)
        {
            System.out.print("Nhap vao cac gia tri cua mang arr["+i+"]=");
             arr[i]=scanner.nextInt();
        }
        System.out.println("Mang vua nhap la :");
        for (int i:arr)
        {
            System.out.println(i);
        }
        System.out.println("cac so nguyen to co trong mang la:");
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("arr["+i+"]="+arr[i]);
            }
        }

    }
}
