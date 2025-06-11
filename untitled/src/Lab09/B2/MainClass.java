package Lab09.B2;

import Lab09.B1.Main;

import java.util.Scanner;

public class MainClass {

    public class NhapLieu {
        private Scanner scanner = new Scanner(System.in);

        public int inputInt() {
            while (true) {
                try {
                    return Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập số nguyên hợp lệ.");
                }
            }
        }

        public float inputFloat() {
            while (true) {
                try {
                    return Float.parseFloat(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập số thực hợp lệ.");
                }
            }
        }

        public String inputString() {
            return scanner.nextLine();
        }
    }

    public void nhapDuLieu() {
        NhapLieu nhap = new NhapLieu();

        System.out.println("Nhập số nguyên:");
        System.out.println("Value = " + nhap.inputInt());

        System.out.println("Nhập số thực:");
        System.out.println("Value = " + nhap.inputFloat());

        System.out.println("Nhập chuỗi:");
        System.out.println("Value = " + nhap.inputString());
    }

    public static void main(String[] args) {
        MainClass main = new MainClass();
        main.nhapDuLieu();
    }

}
