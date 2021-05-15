package B3;

public class NhanVienFullTime extends NhanVien{
    private int soNgay;

    @Override
    public void tinhLg() {
        super.setLg(500*soNgay);
    }

    public NhanVienFullTime() {
        this("",0);
    }

    public NhanVienFullTime(int soNgay) {
        this("",soNgay);
    }

    public NhanVienFullTime(String ten, int soNgay) {
        super(ten);
        this.soNgay = soNgay;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
}
