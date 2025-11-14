package core.bt.lb4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class HoaDonBanhMy {
    private String maHoaDon;
    private LocalDate ngayLapHoaDon;
    private String tenKhachHang;
    private String diaChiKhach;
    private int soLuongBanhCanGiao;
    private BigDecimal giaBanMotChiecBanh;
    private BigDecimal tongTienHang;
    private BigDecimal tienKhuyenMai;
    private BigDecimal tongTienPhaiThanhToan;

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalDate getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChiKhach() {
        return diaChiKhach;
    }

    public void setDiaChiKhach(String diaChiKhach) {
        this.diaChiKhach = diaChiKhach;
    }

    public int getSoLuongBanhCanGiao() {
        return soLuongBanhCanGiao;
    }

    public void setSoLuongBanhCanGiao(int soLuongBanhCanGiao) {
        this.soLuongBanhCanGiao = soLuongBanhCanGiao;
    }

    public BigDecimal getGiaBanMotChiecBanh() {
        return giaBanMotChiecBanh;
    }

    public void setGiaBanMotChiecBanh(BigDecimal giaBanMotChiecBanh) {
        this.giaBanMotChiecBanh = giaBanMotChiecBanh;
    }

    public void tinhTienKhuyenMai()
    {
        if(soLuongBanhCanGiao >=10)
        {
            tienKhuyenMai=tongTienHang.multiply(BigDecimal.valueOf(0.1));
        }
        if(soLuongBanhCanGiao>=100)
        {
            tienKhuyenMai=tongTienHang.multiply(BigDecimal.valueOf(0.2));
        }
    }
}
