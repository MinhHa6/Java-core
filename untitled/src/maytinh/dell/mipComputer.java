package maytinh.dell;

import maytinh.MayTinh;

import java.util.ArrayList;
import java.util.Scanner;

public class mipComputer {
    ArrayList<MayTinh>dsMayTinh= new ArrayList<>();

    public void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("So dien thoai can nhap:");
        int n=Integer.parseInt(sc.nextLine());
        if(n<=3)
        {
            System.out.println("so dien thoai phai lon hon 3");
        }
        else {
            for (int i=0;i<n;i++)
            {
                System.out.println("Dell"+(i+1)+":");
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
            System.out.println("4.Search");
            System.out.println("5.Exit");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    mipComputers.input();
                    break;

            }
        }
    }
}
