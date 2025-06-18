package Lab11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    Scanner sc = new Scanner(System.in);
    private  ArrayList<LuxuryCar>dsxesang = new ArrayList<>();
    // ham nhap
    public void Input()
    {
        System.out.println("Nhap ten xe:");
        String name=sc.nextLine();
        System.out.println("Nhap nha san xuat:");
        String product=sc.nextLine();
        System.out.println("Nhap nam san xuat:");
        int year=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ghe ngoi:");
        int seat=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia goc cua xe:");
        float rootPrice=Float.parseFloat(sc.nextLine());
        System.out.print("Ty gia ban dac biet:");
        float specialRate = Float.parseFloat(sc.nextLine());
        LuxuryCar car = new LuxuryCar(name,product,year,seat,rootPrice,specialRate);
        dsxesang.add(car);
    }
    public void Display() {
        if (dsxesang.isEmpty()) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        for (LuxuryCar car : dsxesang) {
            car.getInfor();
            System.out.println("-----");
        }
    }

    public void SortByPrice() {
        dsxesang.sort(Comparator.comparingDouble(LuxuryCar::calulatePrice));
        System.out.println("Đã sắp xếp theo giá tăng dần.");
    }

    public void SearchByName() {
        System.out.print("Nhập tên xe cần tìm: ");
        String searchName = sc.nextLine();
        boolean found = false;
        for (LuxuryCar car : dsxesang) {
            if (car.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Xe tìm thấy:");
                car.getInfor();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy xe có tên: " + searchName);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Nhập xe sang");
            System.out.println("2. Hiển thị xe sang");
            System.out.println("3. Sắp xếp theo giá");
            System.out.println("4. Tìm theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    test.Input();
                    break;
                case 2:
                    test.Display();
                    break;
                case 3:
                    test.SortByPrice();
                    break;
                case 4:
                    test.SearchByName();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
