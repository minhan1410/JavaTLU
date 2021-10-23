package DongBo.VD2;

import DongBo.VD1.ShareData;

import java.util.Random;

public class Thread1 extends Thread{
    ShareData shareData;

    public Thread1(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        Random random=new Random();
        for(int i=0;i<=10;i++){
            synchronized (shareData){
                int x=random.nextInt(100);
                System.out.println("T1= "+x);
                shareData.random=x;

                shareData.notifyAll();

                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        super.run();
    }
}
