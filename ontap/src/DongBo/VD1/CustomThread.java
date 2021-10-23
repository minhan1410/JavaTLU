package DongBo.VD1;

import java.util.Random;

public class CustomThread extends Thread{
    ShareData shareData;

    public CustomThread(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        Random random=new Random();
        for (int i=0;i<=10;i++){
            int x= random.nextInt(3);
            shareData.add(x);
        }
        super.run();
    }
}
