package Java_Interview_Topics.MultiThreading.Producer_Consumer_Problem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    Queue<Integer> sharedBuffer;
     int bufferSize;

    public SharedResource(int bufferSize)
    {
        this.sharedBuffer=new LinkedList<>();
        this.bufferSize=bufferSize;
    }

    public synchronized void produce(int item) throws InterruptedException {
        if(bufferSize==sharedBuffer.size())
        {
            System.out.println("The Buffered Queue Is Full Can't produce "+ Thread.currentThread().getName());
            wait();
        }
        System.out.println("Produced Item "+item);
        sharedBuffer.add(item);
        notifyAll();
    }
    public synchronized void consumeItem() throws InterruptedException {
        if(sharedBuffer.size()==0)
        {
            System.out.println("The Buffered Quue is Empty Can't Consume "+Thread.currentThread().getName());
            wait();
        }
        int item= sharedBuffer.poll();
        System.out.println("Item Consumed "+item);
        notifyAll();

    }
}
