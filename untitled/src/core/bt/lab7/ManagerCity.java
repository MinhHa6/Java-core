package core.bt.lab7;

import java.util.Scanner;

public class ManagerCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        City[] citys = null;

        while (true) {
            System.out.println("\n======Menu=======");
            System.out.println("1. Nhap thong tin n thanh pho");
            System.out.println("2. Hien thi thong tin");
            System.out.println("3. Sap xep tang dan theo ten nuoc");
            System.out.println("4. Tim kiem theo ten thanh pho");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhap so thanh pho muon nhap: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    citys = new City[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhap thanh pho thu " + (i + 1) + ":");
                        citys[i] = new City();
                        citys[i].nhap();
                    }
                    break;

                case 2:
                    if (citys == null) {
                        System.out.println("Chua co thanh pho nao de hien thi!");
                    } else {
                        System.out.println("=== DANH SACH THANH PHO ===");
                        for (City city : citys) {
                            city.hienThi();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    if (citys == null) {
                        System.out.println("Chua co du lieu thanh pho!");
                    } else {
                        for (int i = 0; i < citys.length - 1; i++) {
                            for (int j = i + 1; j < citys.length; j++) {
                                if (citys[i].getCountry().compareTo(citys[j].getCountry()) > 0) {
                                    City temp = citys[i];
                                    citys[i] = citys[j];
                                    citys[j] = temp;
                                }
                            }
                        }
                        System.out.println("Da sap xep theo ten nuoc!");
                    }
                    break;

                case 4:
                    if (citys == null) {
                        System.out.println("Chua co du lieu tim kiem!");
                    } else {
                        System.out.print("Nhap ten thanh pho muon tim: ");
                        String key = sc.nextLine();

                        boolean found = false;
                        for (City c : citys) {
                            if (c.getCityName().equalsIgnoreCase(key)) {
                                System.out.println("Thong tin thanh pho tim thay:");
                                c.hienThi();
                                System.out.println();
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Khong co thanh pho nao ten '" + key + "'!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thoat chuong trinh...");
                    return;

                default:
                    System.out.println("Lua chon khong hop le! Nhap tu 1 - 5.");
            }
        }
    }
}
