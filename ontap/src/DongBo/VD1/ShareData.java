package DongBo.VD1;

public class ShareData {
    public int random;
    public int x=0;

    public int getRandom() {
        return random;
    }

    public synchronized void add(int v){
        x+=v;
        System.out.println("day "+x);
        for(int i=0;i<=x;i++){
            System.out.print(i+", ");
        }
        System.out.println();
    }
}
