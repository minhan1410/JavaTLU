package ThuVien;

public class Book extends ThongTin{
    private String TenTg;
    private int SoTrang;

    public Book() {
        TenTg = "";
        SoTrang =0;
    }

    public Book(String ma, String TenNhaSx, int SoBan, String tenTg, int soTrang) {
        super(ma, TenNhaSx, SoBan);
        TenTg = tenTg;
        SoTrang = soTrang;
    }

    public String getTenTg() {
        return TenTg;
    }

    public void setTenTg(String tenTg) {
        TenTg = tenTg;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int soTrang) {
        SoTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString()+" -- Book [SoTrang=" + SoTrang + ", TenTg=" + TenTg + "]";
    }   
}
