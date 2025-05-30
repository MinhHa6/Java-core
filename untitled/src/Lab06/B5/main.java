package Lab06.B5;

import java.util.Random;
import java.util.Scanner;

public class main {

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Nhap n phan tu trong mang:");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        // Gán giá trị ngẫu nhiên từ 0–98 cho mảng và in ra
        System.out.print("Mang: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // In ra các số nguyên tố trong mảng
        System.out.println("Cac so nguyen to trong mang:");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }
    }
}
