package core.bt.lab8;

import java.util.Scanner;

public class GVTG extends GiangVien{
    private String coQuanLamViec;

    public GVTG(String nameGv, String email, String diachi, int sdt, float soGioGiangDay,String coQuanLamViec) {
        super(nameGv, email, diachi, sdt, soGioGiangDay);
        this.coQuanLamViec=coQuanLamViec;
    }
    @Override
    public void input()
    {
        super.input();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap co quan lam viec :");
        coQuanLamViec=sc.nextLine();
    }
    @Override
    public  void display()
    { System.out.println("=====TG=====");
        super.display();
        System.out.println("CoQuan:"+coQuanLamViec);
        System.out.println("Luong:"+tinhLuong());
    }
    @Override
    public double tinhLuong() {
        return soGioGiangDay *200000;
    }
}
