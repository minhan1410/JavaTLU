package DongBo.VD1;

public class Main {
    public static void main(String[] args) {
        CustomThread t=new CustomThread(new ShareData());

        CustomThread t1=new CustomThread(new ShareData());

        CustomThread t2=new CustomThread(new ShareData());

        CustomThread t3=new CustomThread(new ShareData());

        CustomThread t4=new CustomThread(new ShareData());

        CustomThread t5=new CustomThread(new ShareData());

        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
