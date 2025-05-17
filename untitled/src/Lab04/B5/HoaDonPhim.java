package Lab04.B5;

import org.w3c.dom.ls.LSOutput;

public class HoaDonPhim {
    private int maHD;
    private String tenKH;
    private int soLuong;
    private float giaMoiVe;
    private String theLoaiPhim;
    private String suatChieu;
    private float khuyenMai;
    private float tongTienTT;

    public HoaDonPhim(int maHD, String tenKH, int soLuong, float giaMoiVe, String theLoaiPhim, String suatChieu) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.soLuong = soLuong;
        this.giaMoiVe = giaMoiVe;
        this.theLoaiPhim = theLoaiPhim;
        this.suatChieu = suatChieu;
    }
    public void KhuyenMai()
    {
        float tongTien=giaMoiVe *soLuong;
        if (theLoaiPhim.equalsIgnoreCase("Bomtan") && suatChieu.equalsIgnoreCase("vip"))
        {
            khuyenMai=tongTien *0.1f;
        }
        else if (soLuong >4)
        {
            khuyenMai=tongTien *0.05f;
        }
        tongTienTT=tongTien-khuyenMai;
    }
    public void view ()
    {
        System.out.println("=====Hoa Don=====");
        System.out.println("Ma hoa don:"+maHD);
        System.out.println("Ten khach hang:"+tenKH);
        System.out.println("So luong :"+soLuong);
        System.out.println("Gia ve:"+giaMoiVe);
        System.out.println("The Loai Phim:"+theLoaiPhim);
        System.out.println("Suat chieu:"+suatChieu);
        System.out.println("Khuyen mai:"+khuyenMai);
        System.out.println("Tong tien thanh toan:"+tongTienTT);
    }
}
