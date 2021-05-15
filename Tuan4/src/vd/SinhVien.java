package vd;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
    private String strMa;
    private String strTen;
    private double dDiem;

    public SinhVien() {
        this("", "", -1.0);
    }

    public SinhVien(String strMa) {
        this(strMa, "", -1.0);
    }

    public SinhVien(String strMa, String strTen, double dDiem) {
        this.strMa = strMa;
        this.strTen = strTen;
        this.dDiem = dDiem;
    }

    public String getMa() { return strMa; }

    public void setMa(String strMa) { this.strMa = strMa; }

    public String getTen() {
        return strTen;
    }

    public void setTen(String strTen) {
        this.strTen = strTen;
    }

    public double getDiem() {
        return dDiem;
    }

    public void setDiem(double dDiem) {
        this.dDiem = dDiem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(strMa, sinhVien.getMa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(strMa);
    }

    @Override
    public int compareTo(SinhVien o) {
        return strMa.compareTo(o.getMa());
    }
}
