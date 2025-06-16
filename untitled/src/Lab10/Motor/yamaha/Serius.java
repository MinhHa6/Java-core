package Lab10.Motor.yamaha;

import Lab10.Motor.Motor;

import java.util.Scanner;

public class Serius extends Motor {
    private  int warranty; // thoi gian bao hanh
    public Serius (){super();}
    public Serius ( String code ,String name, double capacity,int num,int warranty){
        super(code, name, capacity, num);
        this.warranty=warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public void inputInfor()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Serius");
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
