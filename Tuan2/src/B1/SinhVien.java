// package B1;

public class SinhVien {
    private String ma, ten;
    private int nam;
    private double diem;

    public SinhVien() {
        this("", "", 0, 0);
    }

    public SinhVien(String ma, String ten, int nam, double diem) {
        this.ma = ma;
        this.ten = ten;
        this.nam = nam;
        this.diem = diem;
    }

    public int Tuoi() {
        return 2021 - this.nam;
    }

    public void HienThiThongTin() {
        System.out.println("Sinh viên " + ten + ", " + Tuoi() + " tuổi" + ", có mã sinh viên là " + ma + " đạt " + diem + " điểm Java.");
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public static void main(String[] args) {
        SinhVien a = new SinhVien();
        SinhVien b = new SinhVien("A34732", "An", 2001, 1);
        a.HienThiThongTin();
        b.HienThiThongTin();
    }
}
