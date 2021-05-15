package B1;

public class BaiHat {
    private String tieuDe;
    private double thoiLg;

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public double getThoiLg() {
        return thoiLg;
    }

    public void setThoiLg(double thoiLg) {
        this.thoiLg = thoiLg;
    }

    public BaiHat() {
        this("",0);
    }

    public BaiHat(String tieuDe, double thoiLg) {
        this.tieuDe = tieuDe;
        this.thoiLg = thoiLg;
    }

    public void thongTin(){
        System.out.println(getTieuDe()+" - "+getThoiLg());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaiHat baiHat = (BaiHat) o;
        return Double.compare(baiHat.thoiLg, thoiLg) == 0 && tieuDe.equals(baiHat.tieuDe);
    }

}
