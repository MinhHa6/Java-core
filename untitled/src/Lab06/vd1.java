package Lab06;

import java.util.Scanner;

public class vd1 {
    public static void main(String[] args) {
        String []sinhvien = new String[3];
        // su dung vong lap nhap du lieu cho mang
        for (int i=0;i<sinhvien.length;i++)
        {
            System.out.println("Nhap thong tin sinh vien:");
            Scanner input=new Scanner(System.in);
            sinhvien[i]=input.nextLine();
        }
        // hien thi thong tin sinhvien
        for (String s:sinhvien)
        {
            System.out.println(s);
        }
    }
}
