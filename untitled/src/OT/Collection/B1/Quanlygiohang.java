package OT.Collection.B1;

import java.util.ArrayList;
import java.util.List;

public class Quanlygiohang {
    public static void main(String[] args) {
        List<String>ds= new ArrayList<>();
        // dac diem cua list la luu ds co thu tu index va co the trung nhau
        // them ds san pham
        ds.add("S1");
        ds.add("S2");
        ds.add("S3");
        // in ds san pham
        System.out.println("-----------------");
       for(int i=0;i<ds.size();i++)
       {
           System.out.println(ds.get(i));
       }
       for(String d:ds)
       {
           System.out.println(d);
       }
       //xoa san pham theo ten
        System.out.println("----------------");
        ds.remove("S1");
       for(String d:ds)
       {
           System.out.println(d);
       }
       // Dem so lan xuat hien cua 1 san pham
        ds.add("S1");
       ds.add("S1");
       ds.add("S4");
        System.out.println("----------");
        for(String e:ds)
        {
            System.out.println(e);
        }
        int count=0;
       for(String e:ds)
       {
           if(e.equals("S1"))
           {
               count+=1;
           }
       }
        System.out.println("So lan xuat hien cua S1 la:"+count);
    }
}
