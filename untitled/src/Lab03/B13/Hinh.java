package Lab03.B13;

import java.util.Scanner;

public class Hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều rộng: ");
        int chieuRong = scanner.nextInt();

        System.out.print("Nhập chiều cao: ");
        int chieuCao = scanner.nextInt();

        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j < chieuRong; j++) {
                // In dấu * ở hàng đầu tiên, hàng cuối hoặc cột đầu, cột cuối
                if (i == 0 || i == chieuCao - 1 || j == 0 || j == chieuRong - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        ///hinh trai tim
        int n = 6; // Kích thước trái tim

        for (int i = n / 2; i <= n; i += 2) {
            // In khoảng trắng bên trái
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }

            // In nửa trái
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // In khoảng trắng ở giữa
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // In nửa phải
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Phần dưới của trái tim
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
