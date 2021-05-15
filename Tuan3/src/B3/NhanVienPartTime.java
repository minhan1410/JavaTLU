package B3;

public class NhanVienPartTime extends NhanVien{
    private int soGio;

    @Override
    public void tinhLg() {
        super.setLg(40*soGio );
    }

    public NhanVienPartTime() {
        this("",0);
    }

    public NhanVienPartTime(int soGio) {
        this("",soGio);
    }

    public NhanVienPartTime(String ten, int soGio) {
        super(ten);
        this.soGio = soGio;
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }
}
