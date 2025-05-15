package Lab03.B4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập 1 số nguyên n: ");
            int n = scanner.nextInt();

            System.out.println("Các số nguyên tố từ 1 đến " + n + " là:");
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break; // Không phải số nguyên tố
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
}
