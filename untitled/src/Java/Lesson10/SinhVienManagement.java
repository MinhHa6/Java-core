package Java.Lesson10;

import java.util.Arrays;

public class SinhVienManagement {
    private  String []arrSinhVien;
    public SinhVienManagement ()
    {
        arrSinhVien= new String[0];//khoi tao mang phan tu 0
    }
    private  void moRong()
    {
        int size =arrSinhVien.length+1;
        String []temp = Arrays.copyOf(arrSinhVien,size);
        arrSinhVien = new String[size];
        System.arraycopy(temp,0,arrSinhVien,0,size);
    }
    //viet ham them du lieuu kiem soat ngoai le khi them
    public void themSinhVien(String name,int pos)
    {
        try {
            arrSinhVien[pos-1]= name;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            moRong();
            arrSinhVien[arrSinhVien.length-1]= name;
            //loi e
        }
    }
    public void hienthi ()
    {
        for (int i=0;i<arrSinhVien.length;i++)
        {
            String arrSinhVien1 =arrSinhVien[i];
            System.out.println(arrSinhVien1);
        }
    }
}
