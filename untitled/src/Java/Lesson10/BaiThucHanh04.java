package Java.Lesson10;

import java.util.Scanner;

public class BaiThucHanh04 {
    public static void main(String[] args) {
        try
        {
            String number =null;
            Scanner sc= new Scanner(System.in);
            String temp= null;
            if((temp=sc.nextLine()).isEmpty())
            {
                number=null;
            }
            else {
                number=temp;
            }
            System.out.println("Temp=["+temp+"]:");
            float sothuc= Float.parseFloat(number);
            System.out.println("So thuc :"+sothuc);
            System.out.println("phep chia ="+10/(int)sothuc);
        }
        catch (NullPointerException |NumberFormatException e)
        {
            System.out.println("Du lieu ko hop le");
        }
        catch (ArithmeticException arExp)
        {
            System.out.println("Loi tinh toan");
        }
        catch (Exception e)
        {
            System.out.println("ko the thuc hien thao tac vui long bao quan tri vien");
        }
        finally {
            System.out.println("Chuong trinh ket thuc");
        }
    }
}
