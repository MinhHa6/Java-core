package Lab06.B2;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        System.out.println("Nhap n phan tu cua mang:");
        int n=scanner.nextInt();
        int [] arr1= new int[n];
        for (int i=0;i<arr1.length;i++)
        {
            arr1[i]= random.nextInt(10);
            System.out.println("arr["+i+"]="+arr1[i]);
        }

    }
}
