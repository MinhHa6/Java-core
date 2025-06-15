package Lab10.Motor.yamaha;

import java.util.Scanner;

public class Yamaha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so xe can nhap :");
        int n= Integer.parseInt(scanner.nextLine());
        Jupiter []jupiters=new Jupiter[n];
        Serius []seriuses = new Serius[n];
        while (true)
        {
            System.out.println("Menu");
            System.out.println("1.Input");
            System.out.println("2.Display");
            System.out.println("3.Sort");
            System.out.println("4.Search");
            System.out.println("5.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    for (int i=0;i<jupiters.length;i++)
                    {
                        System.out.println("Xe jupiter "+(i+1)+":");
                        jupiters[i]= new Jupiter();
                        jupiters[i].inputInfor();
                    }
                    for (int i=0;i<seriuses.length;i++)
                    {
                        System.out.println("Xe serius "+(i+1)+":");
                        seriuses[i]= new Serius();
                        seriuses[i].inputInfor();
                    }
                    break;
                case 2:
                    for (int i=0;i<jupiters.length;i++)
                    {
                        System.out.println("Xe jupiter"+(i+1)+":");
                        jupiters[i].displayInfor();
                    }
                    for (int i=0;i<seriuses.length;i++)
                    {
                        System.out.println("Xe serius"+(i+1)+":");
                        seriuses[i].inputInfor();
                    }
                    break;
            }
        }

    }
}
