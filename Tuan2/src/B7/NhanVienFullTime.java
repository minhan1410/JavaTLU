package B7;

public class NhanVienFullTime extends NhanVien1 {
    private int ngayLV;

    public NhanVienFullTime() {
        this("", 0);
    }

    public NhanVienFullTime(String ten) {
        super(ten);
    }

    public NhanVienFullTime(int ngayLV) {
        this.ngayLV = ngayLV;
    }

    public NhanVienFullTime(String ten, int ngayLV) {
        super(ten);
        this.ngayLV = ngayLV;
    }

    public int getNgayLV() {
        return ngayLV;
    }

    public void setNgayLV(int ngayLV) {
        this.ngayLV = ngayLV;
    }

    @Override
    public int Luong() {
        return 500 * ngayLV;
    }
}
