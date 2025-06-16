package Lab10.country;

import Lab10.Motor.yamaha.Jupiter;
import Lab10.Motor.yamaha.Serius;
import Lab10.country.asia.AsiaCountry;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n countries:");
        int n= Integer.parseInt(scanner.nextLine());
        AsiaCountry []asiaCountries= new AsiaCountry[n];
        while (true)
        {
            System.out.println("====Menu====");
            System.out.println("1.Input");
            System.out.println("2.Display");
            System.out.println("3.Sort");
            System.out.println("4.Search countryname");
            System.out.println("5.Exit");
            int choice =Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    for (int i=0;i<asiaCountries.length;i++)
                    {
                        System.out.println("Xe jupiter "+(i+1)+":");
                        asiaCountries[i]= new AsiaCountry();
                        asiaCountries[i].input();
                    }
                    break;
                case 2:
                    for (int i=0;i<asiaCountries.length;i++)
                    {
                        System.out.println(" Asiacontry"+(i+1)+":");
                        asiaCountries[i].display();
                    }
                    break;
                case 3:
                    // Sort Jupiter theo giá tăng dần
                    Arrays.sort(asiaCountries, (a, b) -> Double.compare(a.getArea(), b.getArea()));
                    System.out.println("Danh sach countries Asia sau khi sap xep theo gia tang dan:");
                    for (int i = 0; i < asiaCountries.length; i++) {
                        System.out.println("Countries Asia" + (i + 1) + ":");
                        asiaCountries[i].display();
                    }
                    break;
                case 4:
                    System.out.print("Nhap Countriea name can tim: ");
                    String searchId = scanner.nextLine();
                    boolean found = false;

                    for (AsiaCountry a : asiaCountries) {
                        if (a.getCountryName().equalsIgnoreCase(searchId)) {
                            System.out.println("Tim thay trong danh sach Asia countries:");
                            a.display();
                            found = true;
                        }
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
