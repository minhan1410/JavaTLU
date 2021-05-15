package tlu.khmt.A34732;

import java.util.Set;
import java.util.TreeSet;

public class DsSvTreeSet{
    private Set<SinhVien> setSv;

    public DsSvTreeSet() {
        setSv=new TreeSet<SinhVien>();
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

    public Set<SinhVien> getSetSv() {
        return setSv;
    }
}
