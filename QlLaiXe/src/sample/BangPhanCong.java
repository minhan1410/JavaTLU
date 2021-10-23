package sample;

public class BangPhanCong {
    private LaiXe lx;
    private Tuyen tuyen;
    private int luot;

    public BangPhanCong() {
        this(new LaiXe(),new Tuyen(),0);
    }

    public BangPhanCong(LaiXe lx, Tuyen tuyen, int luot) {
        this.lx = lx;
        this.tuyen = tuyen;
        this.luot = luot;
    }

    public LaiXe getLx() {
        return lx;
    }

    public void setLx(LaiXe lx) {
        this.lx = lx;
    }

    public Tuyen getTuyen() {
        return tuyen;
    }

    public void setTuyen(Tuyen tuyen) {
        this.tuyen = tuyen;
    }

    public int getLuot() {
        return luot;
    }

    public void setLuot(int luot) {
        this.luot = luot;
    }
}
