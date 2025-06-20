package Lab07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookManager {
    private List<Book>ds = new ArrayList<>();
    public void Input (){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Nhap so sach ban muon nhap:");
            int n=Integer.parseInt(reader.readLine());
            for (int i=0;i<n;i++) {
                System.out.println("sach thu"+(i+1)+":");

                System.out.println("Ma sach:");
                String isbn = reader.readLine();
                System.out.println("Ten Sach:");
                String namebook = reader.readLine();
                System.out.println("Tac gia:");
                String author = reader.readLine();
                System.out.println("Nhap nha san xuat:");
                String publisher = reader.readLine();
                System.out.println("Nhap gia sach:");
                float price = Float.parseFloat(reader.readLine());
            Book book1 = new Book(isbn,namebook,author,publisher,price);
            ds.add(book1);}
        }
        catch (IOException e)
        {
            System.out.println("Loi khi nhap du lieu"+e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Nhap so hop le"+e.getMessage());
        }
        finally {
            System.out.println("===>");
        }
    }
    public void display ()
    {
        if(ds.isEmpty())
        {
            System.out.println("khong co sach nao ca");
        }
        for (Book bk:ds)
        {
            System.out.println(bk.toString());
        }
    }
    public void sort ()
    {
       ds.sort((a,b)->Float.compare(a.getPrice(),b.getPrice()));
        System.out.println("Ds duoc sap xep theo gia tang dan la:");
        display();
    }
    public static void main(String[] args) {

        BookManager bookManager= new BookManager();
        bookManager.Input();
        System.out.println("ds sau khi nhap la:");
        bookManager.display();
        bookManager.sort();
    }
}
