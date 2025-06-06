package Lab08.B2;

import java.util.Scanner;

public class Flower {
    private String flowerId;
    private String flowerName;
    private String color;
    private int kindOfFlower;//So chung loai hoa nay
    public Flower (){}
    public Flower (String flowerId,String flowerName,String color,int kindOfFlower)
    {
        this.flowerId=flowerId;
        this.flowerName=flowerName;
        this.color=color;
        this.kindOfFlower=kindOfFlower;
    }
    public void setFlowerId (String flowerId)
    {
        this.flowerId=flowerId;
    }
    public String getFlowerId()
    {
        return flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKindOfFlower() {
        return kindOfFlower;
    }

    public void setKindOfFlower(int kindOfFlower) {
        this.kindOfFlower = kindOfFlower;
    }
    public void input ()
    {
        System.out.println("=====Nhap=======");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap id:");
        flowerId=scanner.nextLine();
        System.out.println("Nhap ten hoa:");
        flowerName=scanner.nextLine();
        System.out.println("Mau sac:");
        color=scanner.nextLine();
        System.out.println("Chung loai:");
        kindOfFlower=scanner.nextInt();
    }
    public void display ()
    {
        System.out.println("======Hien thi=====");
        System.out.println("Id:"+flowerId+"\n Ten:"+flowerName+"\nMau sac:"+color+"\n Chung loai:"+kindOfFlower);
    }
}
