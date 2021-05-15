package B1;

public class Thread_DoanSo extends Thread{
    private int random,kq,dem;

    public Thread_DoanSo(int kq,String name) {
        this.kq = kq;
        this.setName(name);
    }

    @Override
    public void run() {
        while(random!=kq){
            random= (int) (Math.random()*100 +1);
            dem++;
            if(random==kq){
                System.out.println(getName()+" doan so: "+random+" trong "+dem+" lan dem.");
                break;
            }
            System.out.println(getName()+" doan so: "+random);
        }

        super.run();
    }
}
