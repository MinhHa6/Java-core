package Lab06;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiThucHanh04 {
    ArrayList<Book>stbook= new ArrayList<>();
    public void nhapDuLieu ()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("So sach muon nhap la:");
        int n=Integer.parseInt(scanner.nextLine());
        for (int i=0;i<n;i++)
        {
            System.out.println("Nhap cuon thu "+(i+1)+":");
            Book book= new Book();
            book.nhapDuLieu();
            stbook.add(book);
        }
    }
    public void hienThids()
    {
        if(stbook.isEmpty())
        {
            System.out.println("ds rong ");
        }
        for(Book books:stbook)
        {
            System.out.println(books.toString());
        }
    }
    public void xoads()
    {
        System.out.println("Nhap so thu sach can xoa :");
        Scanner input= new Scanner(System.in);
        int id=input.nextInt();
        if(id<stbook.size() && id>=0)
        {
            stbook.remove(id);
        }
        System.out.println("Xoa sach thanh cong");
    }
    public int showMenu(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Nhap du lieu");
        System.out.println("2.Hien thi du lieu");
        System.out.println("3.Xoa");
        System.out.println("4.Thoat");
        System.out.println("vui long nhap tu 1 den 4");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        int choose;
        BaiThucHanh04 main= new BaiThucHanh04();
        do{
            choose=main.showMenu();
            switch (choose)
            {
                case 1:
                    main.nhapDuLieu();
                    break;
                case 2:
                    main.hienThids();
                    break;
                case 3:
                    main.xoads();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }
}
