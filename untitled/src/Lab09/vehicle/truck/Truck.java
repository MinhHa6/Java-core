package Lab09.vehicle.truck;

import Lab09.vehicle.vehicles;

import java.util.Scanner;

public class Truck extends vehicles {
    int truckload;
    public Truck()
    {
        super();
    }
    public Truck(String maker,String model,double price,int truckload)
    {
        super(maker, model, price);
        this.truckload=truckload;
    }

    public int getTruckload() {
        return truckload;
    }

    public void setTruckload(int truckload) {
        this.truckload = truckload;
    }
    @Override
    public void input()
    {
        super.input();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Truck load:");
        truckload= scanner.nextInt();
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Truck load:"+truckload);
    }
}
