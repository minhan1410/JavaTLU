package BenhNhan;
import java.util.ArrayList;

public class QlBn {
    private  ArrayList<BenhNhan> bn;
   
    public QlBn(){
        bn=new ArrayList<BenhNhan>();
    }

    public void Add(BenhNhan v){
        bn.add(v);
    }

    public void Sua(BenhNhan v,BenhNhan a){
        bn.set(bn.indexOf(v), a);
    }

    public int TkVt(BenhNhan v){
        return bn.indexOf(v);
    }

    public BenhNhan TkBn(BenhNhan v){
        return bn.get(TkVt(v));
    }

    public void Show(){
        for(BenhNhan i:bn){
            System.out.println(i);
        }
    }
}
