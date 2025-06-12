package Lab10;

import java.util.Scanner;

public class ThinhGiang extends Giangvien{
    private String coquan;
    private float sohgiangdaytrongthang;
    public ThinhGiang (){super();}
    public ThinhGiang(String tengiangvien, String email, String diachi, int dienthoai,String coquan,int sohgiangdaytrongthang) {
        super(tengiangvien, email, diachi, dienthoai);
        this.coquan=coquan;
        this.sohgiangdaytrongthang=sohgiangdaytrongthang;
    }
    @Override
    public void input()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Thinh giang");
        super.input();
        scanner.nextLine();
        System.out.println("\n Nhap co quan:");
        coquan=scanner.nextLine();
        System.out.println("\nNhap so h lam  trong thang:");
        sohgiangdaytrongthang=scanner.nextFloat();
    }
    @Override
    public double tinhLuong() {
            return sohgiangdaytrongthang*200000;
    }
    @Override
    public void  display ()
    {
        super.display();
        System.out.println("\n Co quan:"+coquan+
                "\n So h lam trong thang:"+sohgiangdaytrongthang+
                "Luong nhan duoc:"+tinhLuong());
    }
}
