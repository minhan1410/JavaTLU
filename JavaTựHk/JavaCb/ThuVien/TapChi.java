package ThuVien;

public class TapChi extends ThongTin{
    private int SoPhatHanh,ThangPhatHanh;

    public TapChi() {
        SoPhatHanh=ThangPhatHanh=0;
    }

    public TapChi(String ma, String TenNhaSx, int SoBan, int soPhatHanh, int thangPhatHanh) {
        super(ma, TenNhaSx, SoBan);
        SoPhatHanh = soPhatHanh;
        ThangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return SoPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        SoPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return ThangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        ThangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString()+" -- TapChi [SoPhatHanh=" + SoPhatHanh + ", ThangPhatHanh=" + ThangPhatHanh + "]";
    }
    
}
