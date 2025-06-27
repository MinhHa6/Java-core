package maytinh.dell;

import maytinh.MayTinh;
import maytinh.apple.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class mipComputer {
    ArrayList<MayTinh>dsMayTinh= new ArrayList<>();

    public void input()
    {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("So dien thoai can nhap:");
            int n = Integer.parseInt(sc.nextLine());
            if (n <=3) {
                System.out.println("so dien thoai phai lon hon 3");
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.println("Dell " + (i + 1) + ":");
                    MayTinh mayTinhdell = new Dell();
                    mayTinhdell.inputInfor();
                    dsMayTinh.add(mayTinhdell);
                    System.out.println("Apple " + (i + 1) + ":");
                    MayTinh mayTinhApple = new Apple();
                    mayTinhApple.inputInfor();
                    dsMayTinh.add(mayTinhApple);
                }
            }
        }catch (NumberFormatException e)
        {
            System.out.println("Number"+e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("String");
        }
        finally {
            System.out.println("Tiep");
        }
    }
    public void display()
    {
        if(dsMayTinh.isEmpty())
        {
            System.out.println("Khong co may tinh nao");
        }
        for (MayTinh mt:dsMayTinh)
        {
            System.out.println("Ds may tinh");
            mt.displayInfor();
        }
    }
    public void sort(){
        ArrayList<Dell>dsDell= new ArrayList<>();
        ArrayList<Apple>dsApple= new ArrayList<>();
        for(MayTinh mt:dsMayTinh)
        {
            if(mt instanceof Dell)
            {
                dsDell.add((Dell)mt);
            } else if (mt instanceof Apple) {
                dsApple.add((Apple)mt);
            }
        }
        //Hien thi truoc khi sap xep
        System.out.println("Hien thi truoc khi sap xep");
        for(MayTinh mt:dsDell)
        {
            mt.displayInfor();
        }
        for(MayTinh mt:dsApple)
        {
            mt.displayInfor();
        }
        //Sap xep theo bao hanh
        dsDell.sort((a,b)-> a.getWarranty()-b.getWarranty());
        dsApple.sort((a,b)-> a.getWarranty()-b.getWarranty());
        System.out.println("Danh sach sau khi duoc sap xep ");
        for (MayTinh my:dsDell)
        {
            my.displayInfor();
        }
        for (MayTinh mt:dsApple)
        {
            mt.displayInfor();
        }
    }
    public void search()
    {
        if(dsMayTinh.isEmpty())
        {
            System.out.println("ds rong");
        }
        for(MayTinh mt:dsMayTinh)
        {
            if(mt.getName().equalsIgnoreCase("Apple"))
            {
                System.out.println("Da tim thay");
                mt.displayInfor();
            }
            else {
                System.out.println("Ko tim thay");
            }
        }

    }
    public static void main(String[] args) {
        mipComputer mipComputers= new mipComputer();
        Scanner scanner= new Scanner(System.in);
        while (true)
        {
            System.out.println("=====Menu======");
            System.out.println("1.Input");
            System.out.println("2.Display");
            System.out.println("3.Sort");
            System.out.println("4.Search dien thoai co ten apple");
            System.out.println("5.Exit");
            System.out.println("Lua chon:");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    mipComputers.input();
                    break;
                case 2:
                    mipComputers.display();
                    break;
                case 3:
                    mipComputers.sort();
                    break;
                case 4:
                    mipComputers.search();
                    break;
                case  5:
                    break;
                default:
                    System.out.println("Nhap lua chon cho hop le");
                    break;
            }
        }
    }
}
