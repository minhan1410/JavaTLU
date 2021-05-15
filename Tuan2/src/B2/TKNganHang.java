package B2;

public class TKNganHang {
    private String soTK, ten, email, sdt;
    private double soDu;

    public TKNganHang() {
        this("", "", "", "", 0);
    }

    public TKNganHang(String soTK, String ten, String email, String sdt, double soDu) {
        this.soTK = soTK;
        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
        this.soDu = soDu;
    }

    public void GuiTien(double tienGui) {
        soDu += tienGui;
        System.out.println("Da gui thanh cong");
    }

    public void RutTien(double tienRut) {
        if (soDu >= tienRut) {
            soDu -= tienRut;
            System.out.println("Da rut: " + tienRut + " - Tk con: " + soDu + "đ");
        } else {
            System.out.println("Số dư tài khoản nhỏ hơn số tiền cần rút.");
        }
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public void TTKhachHang() {
        System.out.println("Ten khach hang: " + getTen() + " - so TK: " + getSoTK() + " - so du: " + getSoDu() + " - SDT: " + getSdt() + " - emai: " + getEmail());
    }

    public static void main(String[] args) {
        TKNganHang a = new TKNganHang("01", "An", "@", "01234", 100);
        a.TTKhachHang();System.out.println();

        a.GuiTien(50);
        a.TTKhachHang();System.out.println();

        a.RutTien(200);
        a.TTKhachHang();System.out.println();

        a.RutTien(120);
        a.TTKhachHang();System.out.println();
    }
}
