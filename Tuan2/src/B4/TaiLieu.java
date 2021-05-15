package B4;

public class TaiLieu {
    private TacGia tg;
    private int nxb;
    private String ten;

    public TaiLieu() {
        this("",new TacGia(),0);
    }

    public TaiLieu(String ten,TacGia tg, int nxb) {
        this.ten=ten;
        this.tg = tg;
        this.nxb = nxb;
    }

    public void hienThiThongTin(){
        System.out.println("Tài liệu "+ten+" của tác giả "+tg.getTen()+" được xuất bản vào năm "+nxb+".");
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public TacGia getTg() {
        return tg;
    }

    public void setTg(TacGia tg) {
        this.tg = tg;
    }

    public int getNxb() {
        return nxb;
    }

    public void setNxb(int nxb) {
        this.nxb = nxb;
    }

    public static void main(String[] args) {
        TaiLieu a=new TaiLieu("Lập trình Java",new TacGia("A",0),2021);
        a.hienThiThongTin();
        TaiLieu b=new TaiLieu();
        b.hienThiThongTin();
    }
}
