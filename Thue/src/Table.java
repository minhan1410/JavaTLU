package src;

public class Table {
    private int Bac;
    private String thuNhap ;
    private String thuSuat;

    public Table(int bac, String thuNhap, String thuSuat) {
        Bac = bac;
        this.thuNhap = thuNhap;
        this.thuSuat = thuSuat;
    }

    public int getBac() {
        return Bac;
    }

    public void setBac(int bac) {
        Bac = bac;
    }

    public String getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(String thuNhap) {
        this.thuNhap = thuNhap;
    }

    public String getThuSuat() {
        return thuSuat;
    }

    public void setThuSuat(String thuSuat) {
        this.thuSuat = thuSuat;
    }
}
