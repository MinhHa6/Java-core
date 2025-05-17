package Lab04.B3;

import java.util.Scanner;

public class HoaDonDien {
    private int maHoaDon;
    private String tenKH;
    private int soDienTieuThu;
    private float donGiaDien;
    private int ngayGhi;
    private float tienKhuyenMai;
    private float tongTienThanhToan;

    public void input()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap hoa don tien dien");
        System.out.println("Nhap ma hoa don:");
        maHoaDon=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten khach hang:");
        tenKH=scanner.nextLine();
        System.out.println("Nhap so dien tieu thu:");
        soDienTieuThu=scanner.nextInt();
        System.out.println("Nhap don gia dien:");
        donGiaDien=scanner.nextFloat();
        System.out.println("Nhap ngay ghi:");
        ngayGhi=scanner.nextInt();
    }
    public void tinhTien()
    {
        float tongtien=soDienTieuThu*donGiaDien;
        if (soDienTieuThu>500)
        {
            tienKhuyenMai=tongtien*0.2f;
        }
        else if (soDienTieuThu>300)
        {
            tienKhuyenMai=tongtien*0.15f;
        }
        tongTienThanhToan=tongtien-tienKhuyenMai;
        //phu phi
        if (ngayGhi==31 || ngayGhi==30) {
            tongTienThanhToan+=10000;
        }

    }
    public void view ()
    {
        System.out.println("====Hoa don tien dien=====");
        System.out.println("Ma hoa don:"+maHoaDon);
        System.out.println("Ten Khach hang:"+tenKH);
        System.out.println("So dien tieu thu:"+soDienTieuThu);
        System.out.println("Nhap don gia dien:"+donGiaDien);
        System.out.println("Nhap ngay ghi:"+ngayGhi);
        System.out.println("Tien Khuyen mai:"+tienKhuyenMai);
        System.out.println("Tong tien can thanh toan:"+tongTienThanhToan);
    }
}
