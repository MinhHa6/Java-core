package Lab03.B7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so n >0:");
        int n =scanner.nextInt();
        if(n<=0 )
        {
            System.out.println("vui long nhap lai 1 so >0");

            return;
        }
        int sum =n*(n+1)/2;
        float tbc=sum/n;
        System.out.println("Tong cac so tu 1 den n la:"+sum);
        System.out.println("Trung binh cong la:"+tbc);
        for (int i=1;i<n;i++)
        {
            if (i%2==1)
            {
                System.out.println("So ke nho hon n la :"+i+"Binh phuon cua no la :"+(i*i));
            }
            else
            {
                if(i>tbc)
                {
                    System.out.println("so chan lon hon tb cong:"+i);
                }
            }

        }
    }
}
