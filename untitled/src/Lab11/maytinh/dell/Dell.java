package Lab11.maytinh.dell;

import Lab11.maytinh.MayTinh;

import java.util.Scanner;
//
public class Dell extends MayTinh {
    private int warranty;// thoi gian bao hanh
    public Dell (){};

    public Dell(String code, String name, double price, int warranty) {
        super(code, name, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public  void inputInfor()
    {
        super.inputInfor();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap thoi gian bao hanh:");
        warranty=Integer.parseInt(sc.nextLine());
    }
    // hien thi thong tin dell
    @Override
    public void displayInfor()
    {
        super.displayInfor();
        System.out.println("\n Thoi gian bao hanh:"+warranty);
    }
}
