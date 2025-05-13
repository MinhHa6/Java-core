package Lab03.B3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 2 số nguyên a, b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Tìm ƯCLN (duyệt từ min(a,b) xuống 1)
        int ucln = 1;
        int min = Math.min(Math.abs(a), Math.abs(b));
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
                break;
            }
        }

        // Tìm BCNN (duyệt từ max(a,b) lên tới a*b)
        int max = Math.max(Math.abs(a), Math.abs(b));
        int bcnn = a * b / ucln; // cách nhanh hơn, dùng công thức chuẩn
        // Nếu bạn muốn dùng vòng lặp thay vì công thức:
        /*
        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                bcnn = i;
                break;
            }
        }
        */

        System.out.printf("Ước chung lớn nhất (ƯCLN) của %d và %d là: %d\n", a, b, ucln);
        System.out.printf("Bội chung nhỏ nhất (BCNN) của %d và %d là: %d\n", a, b, bcnn);
    }
}
