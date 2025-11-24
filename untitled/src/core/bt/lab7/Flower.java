package core.bt.lab7;

import java.util.Scanner;

public class Flower {
    private String flowerId;
    private String flowerName;
    private String color;
    private int kindOfFlower;// so chung loai cua  loai hoa nay
    public Flower (){}

    public Flower(String flowerId, String flowerName, String color, int kindOfFlower) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.color = color;
        this.kindOfFlower = kindOfFlower;
    }

    public String getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(String flowerId) {
        this.flowerId = flowerId;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hoa:");
        flowerId =sc.nextLine();
        System.out.println("Nhap ten hoa:");
        flowerName=sc.nextLine();
        System.out.println("Nhap mau hoa:");
        color=sc.nextLine();
        System.out.println("Nhap so chung loai cua hoa:");
        kindOfFlower=sc.nextInt();
    }
    void display()
    {
        System.out.println("Ma:"+flowerId+"||"+"Ten Hoa:"+flowerName+"||"+"Mau hoa:"+color+"||"+"Chungloai:"+kindOfFlower);
    }
}
