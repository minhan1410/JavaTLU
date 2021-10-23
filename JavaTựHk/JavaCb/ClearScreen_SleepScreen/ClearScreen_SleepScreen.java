package ClearScreen_SleepScreen;

public class ClearScreen_SleepScreen  extends Thread{
    public void ClearScreen(){  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public void SleepScreen(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public ClearScreen_SleepScreen() {
    }
    
}