package DongBo.VD3;

public class Thread1 extends Thread{
    Share_Data data;

    public Thread1(Share_Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for(int i=0;i<data.getName().length;i++){
            synchronized (data){
                System.out.print("Ten: "+data.getName(i+1)+" ");
                data.notifyAll();
                try {
                    data.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        super.run();
    }
}
