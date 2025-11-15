package core.bt.lb4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class quanLyHoaDon {
    public static void main(String[] args) {
        HoaDonBanhMy hd1= new HoaDonBanhMy();
        hd1.setMaHoaDon("S1");
        hd1.setNgayLapHoaDon(LocalDate.now());
        hd1.setDiaChiKhach("Nd");
        hd1.setGiaBanMotChiecBanh(BigDecimal.valueOf(1000));
        hd1.setSoLuongBanhCanGiao(15);

        System.out.println("Tong tien hang la:"+hd1.tinhTien());
        System.out.println("Tien khuyen mai:"+hd1.tinhTienKhuyenMai());
        System.out.println("Hoa don can phai tra la:"+hd1.hoaDon());
        System.out.println("Chi tet hoa don:"+hd1);
    }
}
