package MultiThreading;

public class MyThred_By_Runnable  implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            System.out.println("The value of i is "+i );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
               throw new RuntimeException();
            }
        }
    }

    public static void main(String[] args) {
        MyThred_By_Runnable t1=new MyThred_By_Runnable();
        // We need to pass the t1 to Thread class as the runnable interface does not has the start method
        Thread thread=new Thread(t1);
        thread.start();
        //\\//\\//\\//\\
        //Another Thread Object
        AnotherThread thread2=new AnotherThread();
        thread2.start();
    }
}
