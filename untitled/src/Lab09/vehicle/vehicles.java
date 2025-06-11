package Lab09.vehicle;

import java.util.Scanner;

public class vehicles implements IVehicle{
    private  String maker;
    private String model;
    private double price;

    public vehicles (){};

    public vehicles(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap noi san xuat :");
        maker=scanner.nextLine();
        System.out.println("Nhap mau:");
        model=scanner.nextLine();
        System.out.println("Nhap gia:");
        price=scanner.nextDouble();
    }

    @Override
    public void display() {
        System.out.println("Noi san xuat:"+maker+"\nMau:"+model+"\n Price:"+price);
    }
}
