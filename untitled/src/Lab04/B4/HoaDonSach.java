package Lab04.B4;

import java.util.Scanner;

public class HoaDonSach {
    private int maSach;
    private String tenSach;
    private String tenNguoiMua;
    private int soLuong;
    private float donGia;
    private String loaiSach;
    private float giamGia;
    private float tongTienThanhToan;

    public  void input ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======Nhap hoa don sach======");
        System.out.println("Nhap ma sach:");
        maSach=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten sach:");
        tenSach=scanner.nextLine();
        System.out.println("Nhap ten nguoi mua:");
        tenNguoiMua=scanner.nextLine();
        System.out.println("Nhap so luong sach:");
        soLuong= scanner.nextInt();
        System.out.println("Nhap don gia:");
        donGia= scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Nhap loai sach:");
        loaiSach=scanner.nextLine();
    }
    public void khuyenMai()
    {
        float tongtien=donGia*soLuong;
        if (soLuong>=20 && loaiSach.equalsIgnoreCase("giaokhoa"))
        {
            giamGia=tongtien*0.1f;
        }
        else if (soLuong>=5 && loaiSach.equalsIgnoreCase("tieuthuyet"))
        {
            giamGia=tongtien *0.05f;
        } else if (tongtien>10000) {
            giamGia=tongtien *0.03f;
        }
        tongTienThanhToan=tongtien-giamGia;
    }
    public void view ()
    {
        System.out.println("=====Hoa don sach=====");
        System.out.println("Ma sach:"+maSach);
        System.out.println("Ten sach:"+tenSach);
        System.out.println("Ten nguoi mua:"+tenNguoiMua);
        System.out.println("So luong sach:"+soLuong);
        System.out.println("Don gia:"+donGia);
        System.out.println("Loai sach:"+loaiSach);
        System.out.println("Giamgia:"+giamGia);
        System.out.println("Tong tien thanh toan:"+tongTienThanhToan);
    }
}
