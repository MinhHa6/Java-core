package maytinh.dell;

import maytinh.MayTinh;

import java.util.Scanner;

public class Dell extends MayTinh {
    private int warranty;// thoi gian bao hanh
    public Dell (){
    };

    public Dell(String code, String name, int price, int warranty) {
        super(code, name, price);
       this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public void inputInfor()
    {
        Scanner sc= new Scanner(System.in);
        super.inputInfor();
        System.out.println("Nhap thoi gian bao hanh :");
        warranty=Integer.parseInt(sc.nextLine());
    }
    @Override
    public void displayInfor()
    {
        super.displayInfor();
        System.out.println("\n Thoi gian bao hanh:"+warranty);
    }

}
