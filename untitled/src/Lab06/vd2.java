package Lab06;

import java.util.Scanner;

public class vd2 {
    String [][]arrNhanVien = new String[3][2];
    public void nhapDuLieu()
    {
        for (int i=0;i<arrNhanVien.length;i++)
        {
            System.out.println("Nhap thong tin cho nhan vien "+(i+1)+":");
            Scanner sc= new Scanner(System.in);
            arrNhanVien[i][0]=sc.nextLine();
            arrNhanVien[i][1]=sc.nextLine();
        }
        System.out.println("Cam on da nhap lieu");
    }
    public static void main(String[] args) {

    }

}
