package Lab02.B9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Random random =new Random();
        String [] choices= {"bua","keo","bao"};// tao 1 mang gom cach chs
        while (true)
        {
            System.out.println("======= tro choi oan tu ti=======");
            System.out.println("0:bua,1-bao,3-keo,9:thoat chuong trinh");
            System.out.print("Bạn chọn: ");
            int user=scanner.nextInt();
            if (user==9)
            {
                System.out.println("Tam biet");
                break;
            }
            if (user<0 || user>2)
            {
                System.out.println("Kua chon ko hop le");
                continue;
            }
            int computer =random.nextInt(3);
            System.out.println("Ban:"+choices[user]);
            System.out.println("May:"+choices[computer]);
            int results=(user - computer + 3) % 3;
            switch (results)
            {
                case 0 -> System.out.println("Kết quả: Hòa!");
                case 1 -> System.out.println("Kết quả: Bạn thắng!");
                case 2 -> System.out.println("Kết quả: Máy thắng!");
            }
        }

    }
}
