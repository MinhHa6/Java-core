package core.bt.lb4;

import java.time.LocalDate;
import java.util.Scanner;

public class quanLyHoaDon {
    public static void main(String[] args) {
        HoaDonBanhMy hd1= new HoaDonBanhMy();
        hd1.setMaHoaDon("S1");
        hd1.setNgayLapHoaDon(LocalDate.now());
        hd1.setDiaChiKhach("Nd");
        hd1.setGiaBanMotChiecBanh(1000.0);
    }
}
