package Lab08;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerCity {
    private ArrayList dsTP;
    public ManagerCity ()
    {
        dsTP= new ArrayList(100);
    }
    // ham them thanh pho vao danh sach
    public void add (City city)
    {
        dsTP.add(city);
    }
    public void Nhapthongtinnthanhpho ()
    {
        City city;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap so thanh pho muon nhap:");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.println("Thanh pho thu "+i+"La:");
            city= new City();
            city.nhap();
        }
    }
    public void hienThi ()
    {
        if (dsTP.isEmpty())
        {
            System.out.println("Khong co thanh pho nao hien thi.");
        }
        for (int i=0;i<dsTP.size();i++)
        {
            hienThi();
        }
    }
    public static void main(String[] args) {
        ManagerCity managerCity = new ManagerCity();
        while (true)
        {
            System.out.println("====menu=====");
            System.out.println("1.Nhap thong tin n thanh pho");
            System.out.println("2.Hien thi thong tin vua nhap");
            System.out.println("3.Sap xep thong tin tang dan theo ten nuoc");
            System.out.println("4.Tim kiem thong tin theo city Id");
            System.out.println("5.Thoat");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    managerCity.Nhapthongtinnthanhpho();
                case 2:
                    managerCity.hienThi();
            }
        }
    }
}
