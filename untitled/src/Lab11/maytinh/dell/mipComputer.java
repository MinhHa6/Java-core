package Lab11.maytinh.dell;

import Lab11.maytinh.MayTinh;
import Lab11.maytinh.apple.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class mipComputer {
    List<MayTinh> dsmayTinhs = new ArrayList<>();
    public void input() {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.println("Số máy cần nhập:");
                n = Integer.parseInt(scanner.nextLine());
                if (n <3) {
                    System.out.println("Số máy cần nhập phải lớn hơn 3");
                    continue;
                }
                break; // hợp lệ -> thoát khỏi vòng lặp
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
            }
        }

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Dell " + (i + 1) + ":");
                MayTinh mayTinhDell = new Dell();
                mayTinhDell.inputInfor();
                dsmayTinhs.add(mayTinhDell);

                System.out.println("Apple " + (i + 1) + ":");
                MayTinh mayTinhApple = new Apple();
                mayTinhApple.inputInfor();
                dsmayTinhs.add(mayTinhApple);
            } catch (Exception e) {
                System.out.println("Lỗi khi nhập thông tin máy: " + e.getMessage());
                // Bạn có thể cho nhập lại hoặc bỏ qua tùy yêu cầu
            }
        }
    }


    public void display() {
        if (dsmayTinhs.isEmpty()) {
            System.out.println("Danh sách máy tính rỗng!");
            return;
        }
        for (MayTinh mt : dsmayTinhs) {
            mt.displayInfor();
        }
    }

    public void sor() {
        // Lọc Dell
        List<Dell> dsDells = new ArrayList<>();
        // Lọc Apple
        List<Apple> dsApples = new ArrayList<>();

        for (MayTinh mt : dsmayTinhs) {
            if (mt instanceof Dell) {
                dsDells.add((Dell) mt);
            } else if (mt instanceof Apple) {
                dsApples.add((Apple) mt);
            }
        }

        // === HIỂN THỊ TRƯỚC SẮP XẾP ===
        System.out.println("=== Danh sách Dell trước khi sắp xếp ===");
        for (Dell dell : dsDells) {
            dell.displayInfor();
        }

        System.out.println("=== Danh sách Apple trước khi sắp xếp ===");
        for (Apple apple : dsApples) {
            apple.displayInfor();
        }

        // SẮP XẾP
        dsDells.sort(Comparator.comparingInt(Dell::getWarranty));
        dsApples.sort(Comparator.comparingInt(Apple::getWarranty));

        // === HIỂN THỊ SAU SẮP XẾP ===
        System.out.println("\n=== Danh sách Dell sau khi sắp xếp theo bảo hành tăng dần ===");
        for (Dell dell : dsDells) {
            dell.displayInfor();
        }

        System.out.println("\n=== Danh sách Apple sau khi sắp xếp theo bảo hành tăng dần ===");
        for (Apple apple : dsApples) {
            apple.displayInfor();
        }
    }


    public void search() {
        if (dsmayTinhs.isEmpty()) {
            System.out.println("Danh sách máy tính rỗng!");
            return;
        }
        boolean found = false;
        for (MayTinh mt : dsmayTinhs) {
            if (mt.getName().equalsIgnoreCase("Appple")) {
                System.out.println("Máy tính tìm thấy:");
                mt.displayInfor();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy máy có ten Appple ");
        }
    }

    public static void main(String[] args) {
        mipComputer mipComputers = new mipComputer();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=====Menu======");
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    mipComputers.input();
                    break;
                case 2:
                    mipComputers.display();
                    break;
                case 3:
                    mipComputers.sor();
                    break;
                case 4:
                    mipComputers.search();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
