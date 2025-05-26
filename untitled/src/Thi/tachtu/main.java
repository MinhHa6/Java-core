package Thi.tachtu;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap review:");
        String review=scanner.nextLine();
        for (int i=0;i<review.length();i++)
        {
            char c=review.charAt(i);
            if(c!=' ')
            {
                result.append(c);
            }
        }
        System.out.println("review bo chuoi la:"+result);
    }
}
