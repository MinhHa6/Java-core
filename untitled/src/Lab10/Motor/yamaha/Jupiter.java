package Lab10.Motor.yamaha;

import Lab10.Motor.Motor;

import java.util.Scanner;

public class Jupiter extends Motor {
    private int warranty; // thoi gian bao hanh
    public Jupiter (){super();}
    public Jupiter ( String code ,String name, double capacity,int num,int warranty){
        super(code, name, capacity, num);
        this.warranty=warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void inputInfor()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Jupiter");
        super.inputInfor();
        System.out.println("Thoi gian bao hanh:");
        warranty=Integer.parseInt(sc.nextLine());
    }
    @Override
    public void displayInfor()
    {
        super.displayInfor();
        System.out.println("Thoi gian bao hanh:"+warranty);
    }
}
