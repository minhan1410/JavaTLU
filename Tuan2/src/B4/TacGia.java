package B4;

public class TacGia {
    private String ten;
    private int ns;

    public TacGia() {
        this("",0);
    }

    public TacGia(String ten, int nam) {
        this.ten = ten;
        this.ns = nam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }
}
