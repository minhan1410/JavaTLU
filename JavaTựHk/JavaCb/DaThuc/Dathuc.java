package DaThuc;
import java.util.Scanner;

public class Dathuc {
    int bac;
    float []HeSo;

    public Dathuc() {
        bac = 0;
        HeSo=new float [bac+1];
        for(int i=0;i<HeSo.length;i++){
            this.HeSo[i] =0;
        }
    }

    public Dathuc(int bac) {
        this.bac = bac;
        HeSo=new float [bac+1];
        for(int i=0;i<bac;i++){
            this.HeSo[i] =0;
        }
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public float[] getHeSo() {
        return HeSo;
    }

    public void setHeSo(float[] heSo) {
        HeSo = heSo;
    }

    public void Nhap(){
        System.out.print("Nhap: ");
        Scanner scanner = new Scanner(System.in);
        for(int i=HeSo.length-1; i>=0; i--){
            HeSo[i] = scanner.nextFloat();
        }
        scanner.close();
    }

    public void Xuat(){
        for(int i=HeSo.length-1;i>=0;i--){
            if(HeSo[i]!=0){
                if(HeSo[i]>0 && i!=HeSo.length-1){
                    System.out.print(" + ");
                }
                else if(HeSo[i]<0){
                    System.out.print(" - ");
                }

                if(Math.abs(HeSo[i])!=1){
                    System.out.print(Math.abs(HeSo[i]));
                }
                
                if(i>1){
                    System.out.print("x^"+i+" ");
                }
                else if(i==1){
                    System.out.print("x ");
                }
            }
        }
        
    }
    
    public Dathuc Add(Dathuc b){
        Dathuc c;
        if(this.bac>b.bac){
            c=new Dathuc(this.bac);
            for(int i=0;i<this.bac;i++){
                c.HeSo[i]=this.HeSo[i];
            }
        }
        else{
            c=new Dathuc(b.bac);
            for(int i=0;i<c.bac;i++){
                c.HeSo[i]=b.HeSo[i];
            }
        }



        return c;
    }
}
