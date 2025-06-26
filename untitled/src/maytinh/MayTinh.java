package maytinh;

import java.util.Scanner;

public class MayTinh implements IMayTinh{
    private String code;//ma may tinh
    private String name;//ten may tinh
    private int price;//gia may tinh
    public MayTinh (){};

    public MayTinh(String code, String name, int price) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void inputInfor() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma may tinh:");
        code=sc.nextLine();
        System.out.println("Nhap ten may tinh:");
        name=sc.nextLine();
        System.out.println("Nhap gia may tinh:");
        price=Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayInfor() {

        System.out.println("Ma may:"+code+"\n Ten may:"+name+"\n Gia"+price);
    }

    @Override
    public void changeInfor() {

    }
}
