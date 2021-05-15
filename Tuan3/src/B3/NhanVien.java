package B3;

public abstract class NhanVien {
    private String ten;
    private double lg;

    public abstract void tinhLg();

    public NhanVien() {
        this("");
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLg() {
        return lg;
    }

    public void setLg(double lg) {
        this.lg = lg;
    }
}
