package Lab03.B11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = scanner.nextInt();

        System.out.println("Cac so hoan hao tu 1 den " + n + " la:");
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            // Tính tổng các ước thực sự của i
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            // Nếu tổng bằng chính nó -> là số hoàn hảo
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
