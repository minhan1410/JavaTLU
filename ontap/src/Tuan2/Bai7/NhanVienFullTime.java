package Tuan2.Bai7;

public class NhanVienFullTime extends NhanVien{
    private int soNgay;

    public NhanVienFullTime(int soNgay) {
        this.soNgay = soNgay;
    }

    public NhanVienFullTime() {
        this(0);
    }

    @Override
    public String toString() {
        return "NhanVienFullTime [soNgay=" + soNgay + "]";
    }

    @Override
    public double TinhLuong(){
        return soNgay*500.000;
    }
}
