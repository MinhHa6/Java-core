package Lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerCity {
    private ArrayList<City> dsTP;

    public ManagerCity() {
        dsTP = new ArrayList<>(100);
    }

    public void add(City city) {
        dsTP.add(city);
    }

    public void Nhapthongtinnthanhpho() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thanh pho muon nhap:");
        int n = scanner.nextInt();
        scanner.nextLine(); // bỏ dòng thừa
        for (int i = 0; i < n; i++) {
            System.out.println("Thanh pho thu " + (i + 1) + ":");
            City city = new City();
            city.nhap();
            dsTP.add(city);
        }
    }

    public void hienThi() {
        if (dsTP.isEmpty()) {
            System.out.println("Khong co thanh pho nao hien thi.");
            return;
        }
        for (City city : dsTP) {
            city.hienthi();
        }
    }

    public void sapXepTheoTenNuoc() {
        Collections.sort(dsTP, new Comparator<City>() {
            public int compare(City c1, City c2) {
                return c1.getCountry().compareToIgnoreCase(c2.getCountry());
            }
        });
        System.out.println("Da sap xep xong!");
    }

    public void timKiemTheoCityId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap city ID can tim: ");
        String id = scanner.nextLine();
        boolean found = false;
        for (City city : dsTP) {
            if (city.getCityId().equalsIgnoreCase(id)) {
                city.hienthi();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay cityId.");
        }
    }

    public static void main(String[] args) {
        ManagerCity managerCity = new ManagerCity();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== MENU ====");
            System.out.println("1. Nhap thong tin n thanh pho");
            System.out.println("2. Hien thi thong tin vua nhap");
            System.out.println("3. Sap xep thong tin tang dan theo ten nuoc");
            System.out.println("4. Tim kiem thong tin theo city Id");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // bỏ dòng

            switch (choice) {
                case 1:
                    managerCity.Nhapthongtinnthanhpho();
                    break;
                case 2:
                    managerCity.hienThi();
                    break;
                case 3:
                    managerCity.sapXepTheoTenNuoc();
                    break;
                case 4:
                    managerCity.timKiemTheoCityId();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
