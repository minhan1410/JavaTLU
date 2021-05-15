package B6;

public class HinhChuNhat {
    public double cd,cr;

    public HinhChuNhat() {
        this(0,0);
    }

    public HinhChuNhat(double cd, double cr) {
        if(cd<=0 || cr<=0){
            this.cd=this.cr=0;
        }
        else{
            this.cd = cd;
            this.cr = cr;
        }
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        if(cd<=0){
            this.cd=0;
        }
        else{
            this.cd = cd;
        }
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        if(cr<=0){
            this.cr=0;
        }
        else{
            this.cr = cr;
        }
    }

    public double Dt(){
        return cd*cr;
    }
}
