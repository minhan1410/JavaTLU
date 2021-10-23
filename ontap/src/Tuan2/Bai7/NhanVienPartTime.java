package Tuan2.Bai7;

public class NhanVienPartTime extends NhanVien{
    private int soGio;

    public NhanVienPartTime(int soGio) {
        this.soGio = soGio;
    }

    public NhanVienPartTime() {
        this(0);
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime [soGio=" + soGio + "]";
    }

    @Override
    public double TinhLuong(){
        return soGio*40.000;
    }
}
