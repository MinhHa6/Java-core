package Lab03.B13;

import java.util.Scanner;

public class Hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vẽ hình chữ nhật rỗng
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        int chieuRong = scanner.nextInt();

        System.out.print("Nhập chiều cao hình chữ nhật: ");
        int chieuCao = scanner.nextInt();

        System.out.println("\nHình chữ nhật rỗng:");
        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j < chieuRong; j++) {
                if (i == 0 || i == chieuCao - 1 || j == 0 || j == chieuRong - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Vẽ hình trái tim
        System.out.println("\nHình trái tim:");
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

        // Vẽ tam giác cân rỗng
        System.out.print("\nNhập chiều cao tam giác cân rỗng: ");
        int h = scanner.nextInt();

        System.out.println("\nTam giác cân rỗng:");
        for (int i = 0; i < h; i++) {
            // In khoảng trắng trước *
            for (int j = 0; j < h - i - 1; j++) {
                System.out.print(" ");
            }

            // In các ký tự * và khoảng trắng bên trong
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i || i == h - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Vẽ hình vuông rỗng
        System.out.print("\nNhập cạnh hình vuông rỗng: ");
        int canh = scanner.nextInt();

        System.out.println("\nHình vuông rỗng:");
        for (int i = 0; i < canh; i++) {
            for (int j = 0; j < canh; j++) {
                if (i == 0 || i == canh - 1 || j == 0 || j == canh - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
