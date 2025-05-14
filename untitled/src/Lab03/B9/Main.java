package Lab03.B9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("\n===== Cuoi tuan ban muon lam gi =====");
            System.out.println("1. Đi học Java");
            System.out.println("2. Đi chơi công viên ngắm gấu");
            System.out.println("3. Đi về nhà nghỉ");
            System.out.println("4. Ra sông Hồng tắm tiên");
            System.out.println("5. Ngủ cả ngày");
            System.out.println("0. Thoát");
            System.out.print("Bạn chọn gì (1-5)?: ");
            int x=scanner.nextInt();
            switch (x)
            {
                case 1:
                    System.out.println("Di hk Java ");
                    break;
                case 2:
                    System.out.println("Di choi cong vien ngam gau");
                    break;
                case 3:
                    System.out.println("Di ve nha nghi");
                    break;
                case 4:
                    System.out.println("ra song hong tam tien");
                    break;
                case  5:
                    System.out.println(" Ngu ca ngay");
                    break;
                default:
                    System.out.println("Thoat");
                    return;
            }
        }
    }
}
