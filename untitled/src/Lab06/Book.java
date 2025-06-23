package Lab06;

import java.util.Scanner;

public class Book {
    private String bookName;
    private String nxb;
    private int yearsOfPublish;
    private String author;
    private int numOfPages;
    private float price;
    public void nhapDuLieu (){
        System.out.println("Nhap du lieu cho sach");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sach:");
        bookName=sc.nextLine();
        System.out.println("Nha xuat ban:");
        nxb=sc.nextLine();
        System.out.println("Nam xuat ban:");
        yearsOfPublish=Integer.parseInt(sc.nextLine());
        System.out.println("Tac gia:");
        author=sc.nextLine();
        System.out.println("So trang:");
        numOfPages=Integer.parseInt(sc.nextLine());
        System.out.println("Gia:");
        price=Float.parseFloat(sc.nextLine());

    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", nxb='" + nxb + '\'' +
                ", yearsOfPublish=" + yearsOfPublish +
                ", author='" + author + '\'' +
                ", numOfPages=" + numOfPages +
                ", price=" + price +
                '}';
    }
}
