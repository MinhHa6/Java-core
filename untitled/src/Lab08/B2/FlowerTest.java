package Lab08.B2;

import Lab08.City;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FlowerTest {
    private ArrayList<Flower> dshoa;
    public FlowerTest ()
    {
        dshoa= new ArrayList<>(100);
    }
    // them hoa vao danh sach
    public void add (Flower flower)
    {
        dshoa.add(flower);
    }
    public void nhapThongTinLoaiHoa ()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap vao n loai hoa:");
        int n= scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<n;i++)
        {
            System.out.println("Hoa"+(i+1)+"la:");
            Flower flower= new Flower();
            flower.input();
            dshoa.add(flower);
        }
    }
    public void hienThi ()
    {
        if (dshoa.isEmpty())
        {
            System.out.println("Khong co loai hoa nao trong danh sach.");
            return;
        }
        for (Flower flower :dshoa)
        {
            flower.display();
        }
    }
    public  void sapXepTheoTenHoa() {
        Collections.sort(dshoa, new Comparator<Flower>() {
            public int compare(Flower f1, Flower f2) {
                return f1.getFlowerName().compareToIgnoreCase(f2.getFlowerName());
            }
        });
        System.out.println("Đã sắp xếp xong theo tên hoa!");
    }
    public void hienThiHoaMauTrang() {
        boolean found = false;
        for (Flower f : dshoa) {
            if (f.getColor().equalsIgnoreCase("trắng")) {
                f.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có loài hoa nào có màu trắng.");
        }
    }


    public void timKiemFlowerId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap flower Id can tim : ");
        String id = scanner.nextLine();
        boolean found = false;
        for (Flower flower : dshoa) {
            if (flower.getFlowerId().equalsIgnoreCase(id)) {
                flower.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay flower Id.");
        }
    }


    public static void main(String[] args) {
        FlowerTest flowerTest= new FlowerTest();
        while (true)
        {
            System.out.println("=====Menu======");
            System.out.println("1.Nhap thong tin n loai hoa");
            System.out.println("2.Hien thi");
            System.out.println("3.Sap xep theo danh sach tang dan ");
            System.out.println("4.Hien thi tat ca cac loai hoa co mau trang ");
            System.out.println("5.Tim kiem theo flower Id");
            System.out.println("6.Thoat");
            Scanner scanner= new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    flowerTest.nhapThongTinLoaiHoa();
                    break;
                case 2:
                    flowerTest.hienThi();
                    break;
                case 3:
                    flowerTest.sapXepTheoTenHoa();
                    break;
                case 4:
                    flowerTest.hienThiHoaMauTrang();
                    break;
                case 5:
                    flowerTest.timKiemFlowerId();
                    break;
                case 6:
                    break;
            }
        }
    }
}
