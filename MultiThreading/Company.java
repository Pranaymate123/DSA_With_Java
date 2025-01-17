package MultiThreading;

public class Company {

    int n;
    boolean flag=false;

    //flag =false produce_item
    //flag=true  consume item;
   synchronized public void produce_item(int n) throws InterruptedException
    {
        if(flag)
        {
            //consumer is running
            wait();
        }
        this.n=n;
        System.out.println("Item Produced : "+ this.n);
        flag=true;
        notify();
    }

   synchronized public void consume_item() throws InterruptedException
    {
        if(!flag)
        {
            ///producer is running
            wait();
        }
        System.out.println("Item Consumed : "+this.n);
        flag=false;
        notify();
    }
}
