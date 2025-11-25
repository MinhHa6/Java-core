package core.bt.lab9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class BookManager {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Book>listBooks = new ArrayList<>();
    public void input() throws IOException
    {
        System.out.println("Nhap so luong sach:");
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            System.out.println("Sach thu "+(i+1)+":");
            System.out.println("Nhap IsBn:");
            String isBn= br.readLine();

            System.out.print("Nhap ten sach: ");
            String name = br.readLine();

            System.out.print("Nhap tac gia: ");
            String author = br.readLine();

            System.out.print("Nhap nha xuat ban: ");
            String publisher = br.readLine();

            System.out.print("Nhap gia: ");
            float price = Float.parseFloat(br.readLine());
            Book books = new Book(isBn,name,author,publisher,price);
            listBooks.add(books);
        }
    }
    public void display()
    {
        System.out.println("\n ===Ds sach");
        for (Book b:listBooks)
        {
            System.out.println(b);
        }
    }
    // sap xep giam dan theo gia
    public void sortByPrice ()
    {
        int n= listBooks.size();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(listBooks.get(j).getPrice() <listBooks.get(j+1).getPrice())
                {
                    Book temp =listBooks.get(j);
                    listBooks.set(j,listBooks.get(j+1));
                    listBooks.set(j+1,temp);
                }
            }
        }
    }
}
