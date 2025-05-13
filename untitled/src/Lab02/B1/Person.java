package Lab02.B1;

import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private double salary;
    public void input()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap ten:");
         this.name =scanner.nextLine();
        System.out.println("Nhap dia chi:");
         this.address = scanner.nextLine();
        System.out.println("Nhap luong:");
        this.salary=scanner.nextDouble();
    }
    public void view ()
    {
        System.out.println("-----------Thong tin nhan vien------------");
        System.out.println("Ten nhan vien:"+name);
        System.out.println("Dia chi nhan vien:"+address);
        System.out.println("Luong nhan vien:"+salary);
    }

}
