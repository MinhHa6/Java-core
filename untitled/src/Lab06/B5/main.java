package Lab06.B5;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Nhap n phan tu trong mang:");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        // Gán giá trị ngẫu nhiên từ 0–9 cho mảng và in ra
        System.out.print("Mang: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]%arr[i]==0 && arr[i]%1==0)
            {
                System.out.println("arr["+i+"]="+arr[i]);
            }
        }

    }
}
