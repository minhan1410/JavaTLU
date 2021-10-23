package VD;



public class ThreadTest {
    public static void main( String [ ] args ) {
        PrintThread thread1 = new PrintThread( "thread1" );
        PrintThread thread2 = new PrintThread( "thread2" );
        PrintThread thread3 = new PrintThread( "thread3" );
        System.out.println( "Starting threads" );
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println( "Threads started, main ends\n" );
    }
}
