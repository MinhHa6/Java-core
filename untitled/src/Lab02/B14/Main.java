package Lab02.B14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tienThueBaoDienKe = 1000;
        int dinhMucSuDung = 50;
        int giaDinhMuc = 230;

        System.out.println("Nhap so dien cu va moi:");
        int soDienCu = scanner.nextInt();
        int soDienMoi = scanner.nextInt();

        if (soDienMoi < soDienCu) {
            System.out.println("So dien moi phai lon hon so dien cu");
            return; // Thoát chương trình nếu nhập sai
        }

        int soDienTieuThu = soDienMoi - soDienCu;

        int trongDinhMuc = Math.min(soDienTieuThu, dinhMucSuDung);
        int vuotDinhMuc = Math.max(0, soDienTieuThu - dinhMucSuDung);

        int tienTrongDinhMuc = trongDinhMuc * giaDinhMuc;

        int tienVuotDinhMuc = 0;
        if (vuotDinhMuc > 0 && vuotDinhMuc <= 50) {
            tienVuotDinhMuc = vuotDinhMuc * 480;
        } else if (vuotDinhMuc > 50 && vuotDinhMuc <= 100) {
            tienVuotDinhMuc = vuotDinhMuc * 700;
        } else if (vuotDinhMuc > 100) {
            tienVuotDinhMuc = vuotDinhMuc * 900;
        }

        int tongTien = tienThueBaoDienKe + tienTrongDinhMuc + tienVuotDinhMuc;

        // In kết quả
        System.out.println("Chi so cu: " + soDienCu);
        System.out.println("Chi so moi: " + soDienMoi);
        System.out.println("Tien trong dinh muc: " + tienTrongDinhMuc);
        System.out.println("Tien vuot dinh muc: " + tienVuotDinhMuc);
        System.out.println("Tong tien phai tra: " + tongTien);
    }
}
