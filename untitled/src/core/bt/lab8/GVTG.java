package core.bt.lab8;

public class GVTG extends GiangVien{
    private String coQuanLamViec;

    public GVTG(String nameGv, String email, String diachi, int sdt, float soGioGiangDay,String coQuanLamViec) {
        super(nameGv, email, diachi, sdt, soGioGiangDay);
        this.coQuanLamViec=coQuanLamViec;
    }
    @Override
    public void input()
    {
        System.out.println("=====TG=====");
    }
    @Override
    public double tinhLuong() {
        return 0;
    }
}
