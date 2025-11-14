package core.bt.lb3;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so N > 0:");
        int n = sc.nextInt();

        int sum = 0;

        // In các số lẻ < n và tính tổng bình phương của chúng
        System.out.println("Cac so le < n la:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                sum += i * i;
            }
        }

        System.out.println("\nTong binh phuong cac so le la: " + sum);

        // Tính trung bình cộng từ 1 đến n
        double tbc = (double) (n * (n + 1) / 2) / n; // hoặc (1+n)/2

        System.out.println("Trung binh cong tu 1 den " + n + " la: " + tbc);
        System.out.println("Cac so chan > trung binh cong la:");

        // In các số chẵn > TBC
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i > tbc) {
                System.out.print(i + " ");
            }
        }
    }
}
