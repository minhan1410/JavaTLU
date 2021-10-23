package Tuan2.Bai6;

public class NhanVienPartTime extends NhanVien {
    public int GioLmVc;

    public NhanVienPartTime() {
        GioLmVc=0;
    }

    public NhanVienPartTime(int gioLmVc) {
        GioLmVc = gioLmVc;
    }

    public NhanVienPartTime(String name, int gioLmVc) {
        super(name);
        GioLmVc = gioLmVc;
    }

    public int getGioLmVc() {
        return GioLmVc;
    }

    public void setGioLmVc(int gioLmVc) {
        GioLmVc = gioLmVc;
    }

    @Override
    public double Luong() {
        return GioLmVc * 40.000;
    }
}
