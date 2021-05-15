package tlu.khmt.A34732;

import java.util.HashSet;
import java.util.Set;

public class DsSvHashSet {
    private Set<SinhVien> setSv;

    public DsSvHashSet() {
        setSv = new HashSet<SinhVien>();
    }

    public void add(SinhVien v){
        if(!setSv.contains(v)){
            setSv.add(v);
        }
    }

    public void xuat(){
        for (SinhVien i: setSv) {
            System.out.println(i.getMsv()+" - "+i.getTen()+" - "+i.getDiem());
        }
    }
}
