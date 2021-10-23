package NganHang;

public class Account {
    private long SoTK;
    private String TenTK;
    private double SoTien;
    final double LaiSuat=0.035;

    public Account() {
    }

    public Account(long soTK, String tenTK, double soTien) {
        SoTK = soTK;
        TenTK = tenTK;
        SoTien = soTien;
    }

    public long getSoTK() {
        return SoTK;
    }

    public void setSoTK(long soTK) {
        SoTK = soTK;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String tenTK) {
        TenTK = tenTK;
    }

    public double getSoTien() {
        return SoTien;
    }

    public void setSoTien(double soTien) {
        SoTien = soTien;
    }

    @Override
    public String toString() {
        return "Account [SoTK=" + SoTK + ", SoTien=" + SoTien + ", TenTK=" + TenTK + "]";
    }

    public void NapTien(double TienNap){
        if(TienNap>=0){
            SoTien +=TienNap;
        }
    }

    public void RutTien(double TienRut){
        if(TienRut<=SoTien){
            SoTien -=TienRut;
        }
    }

    public void DaoHan(){
        SoTien +=SoTien+SoTien*LaiSuat;
    }

    public long ChuyenKhoan(long TKChuyen,double TienChuyen){
        RutTien(TienChuyen);
        return TKChuyen;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(LaiSuat);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + (int) (SoTK ^ (SoTK >>> 32));
        temp = Double.doubleToLongBits(SoTien);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((TenTK == null) ? 0 : TenTK.hashCode());
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
        Account other = (Account) obj;
        if (Double.doubleToLongBits(LaiSuat) != Double.doubleToLongBits(other.LaiSuat))
            return false;
        if (SoTK != other.SoTK)
            return false;
        if (Double.doubleToLongBits(SoTien) != Double.doubleToLongBits(other.SoTien))
            return false;
        if (TenTK == null) {
            if (other.TenTK != null)
                return false;
        } else if (!TenTK.equals(other.TenTK))
            return false;
        return true;
    }
    
}
