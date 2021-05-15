package B1;

import java.util.*;

public class SetSV {
    private Set<SinhVien> sv;

    public SetSV() {
        sv = new HashSet<SinhVien>();
    }

    public boolean add(SinhVien v) {
        if (!sv.contains(v)) {
            sv.add(v);
            return true;
        }
        return false;
    }

    public void show() {
        for (SinhVien i : sv) {
            System.out.println("Msv: " + i.getMsv() + " - Ten: " + i.getTen() + " - Diem: " + i.getDiem());
        }
    }

    public void sxMSV() {
        ArrayList<SinhVien> aSV = new ArrayList<SinhVien>(sv);
        Collections.sort(aSV, (v1, v2) -> v1.getMsv().compareTo(v2.getMsv()));
        aSV.forEach(i ->
                System.out.println("Msv: " + i.getMsv() + " - Ten: " + i.getTen() + " - Diem: " + i.getDiem()));
    }

    public void sxTen() {
        ArrayList<SinhVien> aSV = new ArrayList<SinhVien>(sv);
        Collections.sort(aSV, (v1, v2) -> v1.getTen().compareTo(v2.getTen()));
        aSV.forEach(i ->
                System.out.println("Msv: " + i.getMsv() + " - Ten: " + i.getTen() + " - Diem: " + i.getDiem()));
    }

    public void sxDiem() {
        ArrayList<SinhVien> aSV = new ArrayList<SinhVien>(sv);
        Collections.sort(aSV, (v1, v2) -> v1.getDiem() > v2.getDiem() ? 1 : -1);
        aSV.forEach(i ->
                System.out.println("Msv: " + i.getMsv() + " - Ten: " + i.getTen() + " - Diem: " + i.getDiem()));
    }
}
