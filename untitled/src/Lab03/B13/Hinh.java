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

    }
}
