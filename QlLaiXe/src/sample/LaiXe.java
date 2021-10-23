package sample;
public class LaiXe {
    public static int maLx=10000;
    private String ten,dc;
    private String trinhDo;

    public LaiXe() {
        this("","","");
    }

    public LaiXe(String ten, String dc, String trinhDo) {
        this.ten = ten;
        this.dc = dc;
        this.trinhDo = trinhDo;
    }

    public static int getMaLx() {
        return maLx;
    }

    public static void setMaLx(int maLx) {
        LaiXe.maLx = maLx;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "LaiXe{" +
                "ma= "+maLx + '\'' +
                "ten='" + ten + '\'' +
                ", dc='" + dc + '\'' +
                ", trinhDo=" + trinhDo +
                '}';
    }
}
