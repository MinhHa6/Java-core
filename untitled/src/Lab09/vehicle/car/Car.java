package Lab09.vehicle.car;

import Lab09.vehicle.vehicles;

import java.util.Scanner;

public class Car extends vehicles {
    String color;
    public Car ()
    {
        super();
    }
    public Car (String maker,String model,double price,String color)
    {
        super(maker,model,price);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void input()
    {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Color:");
        color=scanner.nextLine();
    }
    @Override
    public void display ()
    {
        super.display();
        System.out.println("Color:"+color);
    }
}
