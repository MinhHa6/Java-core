package Lab04.B2;

import java.util.Scanner;

public class Customer {
    private int id;
    private String name;
    private String address;
    private int age;
    private float salary;
    Scanner scanner = new Scanner(System.in);
    public  void input ()
    {
        System.out.println("======Nhap vao thong tin nhan vien ====");
        System.out.println("Nhap vao ma nhan vien:");
        id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap vao ten nhan vien:");
        name=scanner.nextLine();
        System.out.println("nhap vao dia chi nhan vien:");
        address=scanner.nextLine();
        System.out.println("Nhap vao tuoi nhan vien:");
        age=scanner.nextInt();
        System.out.println("Nhap luong nhan vien:");
        salary=scanner.nextFloat();
    }
    public double luongthuong (int bonus)
    {
        return salary+salary *(bonus/100.0);

    }
    public void viewData ()
    {
        System.out.println("======In ra thong tin nhan vien=======");
        System.out.println("Manv:"+id);
        System.out.println("Ten nhan vien:"+name);
        System.out.println("Dia chi nhan vien:"+address);
        System.out.println("Tuoi:"+age);
        System.out.println("Luong:"+salary);
        System.out.println("Tong luong:"+luongthuong(10));
    }

    public void accept(String helloLamda) {
    }
}
