package Lab10.Motor.yamaha;

import java.util.Arrays;
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
                case 3:
                    // Sort Jupiter theo giá tăng dần
                    Arrays.sort(jupiters, (a, b) -> Integer.compare(a.getWarranty(), b.getWarranty()));
                    System.out.println("Danh sach Jupiter sau khi sap xep theo gia tang dan:");
                    for (int i = 0; i < jupiters.length; i++) {
                        System.out.println("Xe Jupiter " + (i + 1) + ":");
                        jupiters[i].displayInfor();
                    }

                    // Sort Serius theo giá tăng dần
                    Arrays.sort(seriuses, (a, b) -> Integer.compare(a.getWarranty(), b.getWarranty()));
                    System.out.println("Danh sach Serius sau khi sap xep theo gia tang dan:");
                    for (int i = 0; i < seriuses.length; i++) {
                        System.out.println("Xe Serius " + (i + 1) + ":");
                        seriuses[i].displayInfor();
                    }
                    break;
                case 4:
                    System.out.print("Nhap ID can tim: ");
                    String searchId = scanner.nextLine();
                    boolean found = false;

                    for (Jupiter j : jupiters) {
                        if (j.getName().equalsIgnoreCase(searchId)) {
                            System.out.println("Tim thay trong danh sach Jupiter:");
                            j.displayInfor();
                            found = true;
                        }
                    }

                    for (Serius s : seriuses) {
                        if (s.getName().equalsIgnoreCase(searchId)) {
                            System.out.println("Tim thay trong danh sach Serius:");
                            s.displayInfor();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Khong tim thay xe co ID: " + searchId);
                    }
                    break;

                case 5:
                    System.out.println("Thoat chuong trinh. Tam biet!");
                    return;

                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }
        }

    }
}
