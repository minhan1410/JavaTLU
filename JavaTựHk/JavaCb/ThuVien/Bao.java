package ThuVien;

public class Bao extends ThongTin{
    private int NgayPhatHanh;

    public Bao(String ma, String TenNhaSx, int SoBan, int ngayPhatHanh) {
        super(ma, TenNhaSx, SoBan);
        NgayPhatHanh = ngayPhatHanh;
    }

    public Bao() {
        NgayPhatHanh=0;
    }

    public int getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        NgayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString()+" -- Bao [NgayPhatHanh=" + NgayPhatHanh + "]";
    }
    
    
}
