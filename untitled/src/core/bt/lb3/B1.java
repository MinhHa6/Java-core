package core.bt.lb3;

import java.util.Scanner;

// tinh tong tu 1 den 100
// tinh tong tu 1 den n
// in ra day so tu 1 den n
public class B1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Tong tu 1 den 100 la:"+sum);
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // chỉ dừng khi i không phải số nguyên tố
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
