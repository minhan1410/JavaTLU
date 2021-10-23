package Tuan2.Bai6;

public class NhanVienFullTime extends NhanVien {
    private int NgayLmVc;

    public NhanVienFullTime() {
        NgayLmVc=0;
    }

    public NhanVienFullTime(int ngayLmVc) {
        NgayLmVc = ngayLmVc;
    }

    public NhanVienFullTime(String name, int ngayLmVc) {
        super(name);
        NgayLmVc = ngayLmVc;
    }

    public int getNgayLmVc() {
        return NgayLmVc;
    }

    public void setNgayLmVc(int ngayLmVc) {
        NgayLmVc = ngayLmVc;
    }

    @Override
    public double Luong() {
        return NgayLmVc * 500.000;
    }
}
