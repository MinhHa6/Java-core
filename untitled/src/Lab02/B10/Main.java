package Lab02.B10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ky tu:");
        char colors= scanner.nextLine().charAt(0);
        switch (Character.toUpperCase(colors))
        {
            case 'G': case 'g':
                System.out.println("Green");
                break;
            case 'R': case 'r':
                System.out.println("Red");
                break;
            case 'B': case 'b':
                System.out.println("Blue");
                break;
            default:
                System.out.println("Black");
        }
    }
}
