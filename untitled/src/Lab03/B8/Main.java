package Lab03.B8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n can tinh gia thua :");
        int n=scanner.nextInt();
        //cach dung vong lap
        int nFact =1;
        for(int i=n;i>0;i--)
        {
            nFact=nFact *i;
        }
        System.out.println("n giai thua ="+nFact);

        System.out.println("Giai thua de quy :"+giaiThua(n));
    }
    // cach dung de quy
    public static int giaiThua (int n)
    {

        if(n==0 || n==1)
        {
            return 1;
        }
        return n*giaiThua(n-1);
    }
}
