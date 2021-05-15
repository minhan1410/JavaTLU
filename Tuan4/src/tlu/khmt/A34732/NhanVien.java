package tlu.khmt.A34732;

import java.util.Objects;

public class NhanVien {
    private int ma;
    private String ten;
    private double lg;

    public NhanVien() {
        this(0,"",0);
    }

    public NhanVien(int ma, String ten, double lg) {
        this.ma = ma;
        this.ten = ten;
        this.lg = lg;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLg() {
        return lg;
    }

    public void setLg(double lg) {
        this.lg = lg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NhanVien nhanVien = (NhanVien) o;
        return ma == nhanVien.ma;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ma);
    }

    @Override
    public String toString() {
        return "Ma: "+ma+" - Ten: "+ten+" - ";
    }
}
