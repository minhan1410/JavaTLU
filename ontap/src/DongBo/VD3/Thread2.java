package DongBo.VD3;

public class Thread2 extends Thread{
    Share_Data data;

    public Thread2(Share_Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for(int i=0;i<data.getAddress().length;i++){
            synchronized (data){
                data.notifyAll();
                try {
                    data.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("- DC: "+data.getAddress(i+1));
            }
        }
        super.run();
    }
}