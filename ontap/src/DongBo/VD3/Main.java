package DongBo.VD3;

public class Main {
    public static void main(String[] args) {
        Share_Data a =new Share_Data();
        Thread1 thread1=new Thread1(a);
        Thread2 thread2=new Thread2(a);

        thread2.start();
        thread1.start();
    }
}
