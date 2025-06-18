package Lab11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<LuxuryCar> dsxesang= new ArrayList<>();
    LuxuryCar la;
    Car car;
    // Nhap ds xe sang ;
    public  void  Input()
    {
        System.out.print("Nhập tên xe: ");
        String name = scanner.nextLine();
        System.out.print("Nhà sản xuất: ");
        String producer = scanner.nextLine();
        System.out.print("Năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Số chỗ ngồi: ");
        int seat = Integer.parseInt(scanner.nextLine());
        System.out.print("Giá gốc: ");
        float rootPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Tỷ lệ đặc biệt (% dưới dạng thập phân): ");
        float specialRate = Float.parseFloat(scanner.nextLine());
        LuxuryCar car = new LuxuryCar(name, producer, year, seat, rootPrice, specialRate);
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
        String searchName = scanner.nextLine();
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
    Test test= new Test();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("===Menu====");
            System.out.println("1.Input LuxuryCar");
            System.out.println("2.Display LuxuryCar");
            System.out.println("3.Sort price ");
            System.out.println("4.Search Name");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
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
                default:
                    System.out.println("Chon so cho hop le");
                    break;
            }
        }
    }
}
