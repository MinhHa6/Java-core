package Lab06.B4;

import java.util.Random;
import java.util.Scanner;

public class Main {
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

        // Gán max, min bắt đầu từ phần tử đầu tiên (sau khi đã gán giá trị)
        int max = arr[0];
        int min = arr[0];

        // Tìm max, min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Gia tri nho nhat: " + min);
    }
}
