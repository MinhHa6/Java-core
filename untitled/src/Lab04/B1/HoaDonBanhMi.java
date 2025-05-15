package Lab04.B1;

import java.util.Scanner;

public class HoaDonBanhMi {
    private int maHoaDon;
    private int ngayNhapHoaDon;
    private String tenKh;
    private String diaChiKh;
    private int sLBanhCanGiao;
    private float giaBan1chiec;
    private float tongTienHang;
    private float tienKhuyenMai;
    private float tongTienThanhToan;

    public HoaDonBanhMi(int maHoaDon, int ngayNhapHoaDon, String tenKh, String diaChiKh, int sLBanhCanGiao, float giaBan1chiec) {
        this.maHoaDon = maHoaDon;
        this.ngayNhapHoaDon = ngayNhapHoaDon;
        this.tenKh = tenKh;
        this.diaChiKh = diaChiKh;
        this.sLBanhCanGiao = sLBanhCanGiao;
        this.giaBan1chiec = giaBan1chiec;
        this.tongTienHang = this.sLBanhCanGiao * this.giaBan1chiec;
        this.tienKhuyenMai = tinhTienKhuyenMai();
        this.tongTienThanhToan = this.tongTienHang-tienKhuyenMai;
    }

    public float tinhTienKhuyenMai()
    {
        if (sLBanhCanGiao >= 100) {
            return tongTienHang * 0.2f;
        } else if (sLBanhCanGiao >= 10) {
            return giaBan1chiec * 0.9f;  // hoặc có thể xem lại khuyến mãi tính trên đơn vị như thế nào
        } else {
            return 0;
        }
    }

    public void nhapThongTinHoaDon ()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap mahoa don:");
        this.maHoaDon=scanner.nextInt();
        System.out.println("Ngay nhap hoa don :");
        this.ngayNhapHoaDon=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ten khach hang:");
        this.tenKh=scanner.nextLine();
        System.out.println("Dia chi khach hang:");
        this.diaChiKh=scanner.nextLine();
        System.out.println("So luong banh mua:");
        this.sLBanhCanGiao=scanner.nextInt();
        System.out.println("Gia ban 1 chiec:");
        this.giaBan1chiec=scanner.nextFloat();
        System.out.println("Tong tien hang :");
        this.tongTienHang=scanner.nextFloat();
        System.out.println("Tien khuyen mai:");
        this.tienKhuyenMai=scanner.nextFloat();
        System.out.println("Tong tien can phai thanh toan:");
        this.tongTienThanhToan=scanner.nextFloat();
    }
    public void inHoaDon ()
    {
        System.out.println("========Hoa don banh=========");
        System.out.println("Mahd"+maHoaDon);
        System.out.println("Ngay nhap hoa don:"+ngayNhapHoaDon);
        System.out.println("Ten khach hang:"+tenKh);
        System.out.println("Dia chi khach hang:"+diaChiKh);
        System.out.println("So luong banh mua:"+sLBanhCanGiao);
        System.out.println("Gia ban 1 chiec banh:"+giaBan1chiec);
        System.out.println("Tong tien hang :"+tongTienHang);
        System.out.println("Tien khuyen mai:"+tienKhuyenMai);
        System.out.println("Tong tien can phai thanh toan:"+tongTienThanhToan);
    }
}
