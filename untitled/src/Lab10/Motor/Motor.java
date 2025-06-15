package Lab10.Motor;

import java.util.Scanner;

public class Motor implements IMotor{
    private String code;// ma xe
    private  String name; // ten loai xe
    private double capacity; //dun tich xi lanh
    private  int num;// kieu truyen luc la may so

    public Motor(String code, String name, double capacity, int num) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.num = num;
    }
    public Motor (){};

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma xe:");
        code= scanner.nextLine();
        System.out.println("Nhap ten loai xe:");
        name=scanner.nextLine();
        System.out.println("Nhap dung tich xi lanh:");
        capacity=Double.parseDouble(scanner.nextLine());
        System.out.println("kieu truyen luc la:");
        num=Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void displayInfor() {


        System.out.println("Ma xe:"+code+"\nTen xe:"+name+
                "\n Dung tich xi lanh:"+capacity+"\n Kieu truyen dong luc:"+num);
    }

    @Override
    public void changeInfor() {

    }
}
