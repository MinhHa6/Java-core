package Lab09.B2;

import Lab09.B1.Main;

import java.util.Scanner;

public class MainClass {
    public void nhapdulieu(){}

    public String inputString()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public int inputInt ()
    {
        Scanner input = new Scanner(System.in);
        do {
            try {
                int number =Integer.parseInt(input.nextLine());
                return number;
            }
            catch (Exception e)
            {
                System.out.println("Vui long nhap so nguyen");
            }
        }
        while (true);
    }
    public float inputFloat ()
    {
        Scanner input = new Scanner(System.in);
        do {
            try {
                float number =Float.parseFloat(input.nextLine());
                return number;
            }
            catch (Exception e)
            {
                System.out.println("Vui long nhap so thuc");
            }
        }
        while (true);
    }
    private class nhaplieu{};
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.nhapdulieu();
        
    }
}
