package MultiThreading;

public class AnotherThread extends Thread{

    public void run()
    {
        for(int i=10;i>0;i--)
        {
            System.out.println("another thread ==> "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
