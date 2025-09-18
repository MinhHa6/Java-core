package OT.Exception;

import java.util.Scanner;

public class Bth4 {
    public static void main(String[] args) {
        try {
            String number = null;
            Scanner nhap = new Scanner(System.in);
            String temp = null;
            if ((temp = nhap.nextLine()).isEmpty()) {
                number = null;
            } else {
                number = temp;
            }

            System.out.println("temp=["+temp+"]");
            float soThuc=Float.parseFloat(number);
            System.out.println("So thuc:"+soThuc);
            System.out.println("Phep chia="+(10/(int)soThuc));
        }
        catch (NullPointerException |NumberFormatException e)
        {
            System.out.println("Du lieu ko hop le");
        }
        catch (ArithmeticException arExp)
        {
            System.out.println("Loi tinh toan ");
        }
        finally {
            System.out.println("Chuong trinh ket thuc");
        }
    }

}

