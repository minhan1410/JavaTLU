package ThuVien;

public class ThongTin {
    private String ma,TenNhaSx;
    private int SoBan;

    public ThongTin(){
        ma=TenNhaSx="";
        SoBan=0;
    }

    public ThongTin(String ma,String TenNhaSx,int SoBan){
        this.ma=ma;
        this.TenNhaSx=TenNhaSx;
        this.SoBan=SoBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNhaSx() {
        return TenNhaSx;
    }

    public void setTenNhaSx(String tenNhaSx) {
        TenNhaSx = tenNhaSx;
    }

    public int getSoBan() {
        return SoBan;
    }

    public void setSoBan(int soBan) {
        SoBan = soBan;
    }

    @Override
    public String toString() {
        return "ThongTin [SoBan=" + SoBan + ", TenNhaSx=" + TenNhaSx + ", ma=" + ma + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + SoBan;
        result = prime * result + ((TenNhaSx == null) ? 0 : TenNhaSx.hashCode());
        result = prime * result + ((ma == null) ? 0 : ma.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ThongTin other = (ThongTin) obj;
        if (SoBan != other.SoBan)
            return false;
        if (TenNhaSx == null) {
            if (other.TenNhaSx != null)
                return false;
        } else if (!TenNhaSx.equals(other.TenNhaSx))
            return false;
        if (ma == null) {
            if (other.ma != null)
                return false;
        } else if (!ma.equals(other.ma))
            return false;
        return true;
    }

    
}