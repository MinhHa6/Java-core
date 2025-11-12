package core.bt.lb2;

import java.util.Scanner;

public class B1 {
    private String name;
    private String address;
    private double salary;
    public  void input()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap name:");
        name=scanner.nextLine();
        System.out.println("Nhap di chi:");
        address=scanner.nextLine();
        System.out.println("Nhap salary:");
        salary=scanner.nextDouble();
    }
    public void view()
    {
        System.out.println("Name:"+name+"-"+"Dia chi:"+address+"-"+"Luong:"+salary);
    }
}
