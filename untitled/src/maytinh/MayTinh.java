package maytinh;

import java.util.Scanner;

public class MayTinh implements IMayTinh{
    private String code;// ma
    private String name;// ten
    private double price;// gia
    public MayTinh (){};

    public MayTinh(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma may tinh:");
        code=scanner.nextLine();
        System.out.println("Nhap ten may tinh:");
        name=scanner.nextLine();
        System.out.println("Nhap gia may tinh:");
        price=Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void displayInfor() {
        System.out.println("Ma:"+code+"\n Ten may tinh:"+name
        +"\n Gia:"+price);
    }

    @Override
    public void changeInfor() {

    }
}
