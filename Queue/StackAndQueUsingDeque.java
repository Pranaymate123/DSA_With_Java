package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackAndQueUsingDeque {

   static Deque<Integer> deque=new LinkedList<>();

    //stack
    public static void push(int data)
    {
        deque.addLast(data);
    }

    public static int pop()
    {
        if(deque.isEmpty())
        {
            return -1;
        }
        return deque.removeLast();
    }

    public static int stackPeek()
    {
        if(deque.isEmpty())
        {
            return -1;
        }
        return deque.getLast();
    }

    public static boolean isEmpty()
    {
        return deque.isEmpty();
    }

    /// queue
    public static void add(int x)
    {
        deque.addLast(x);
    }

    public static int remove()
    {
        if(deque.isEmpty())
        {
            return -1;
        }
        return deque.removeFirst();
    }

    public static int quePeek()
    {
        if(deque.isEmpty())
        {
            return -1;
        }
        return deque.getFirst();
    }

    public static void main(String[] args) {
//        push(1);
//        push(2);
//        push(3);
//        while (!isEmpty())
//        {
//            System.out.println(stackPeek());
//            pop();
//        }

        add(1);
        add(2);
        add(3);

        while(!isEmpty())
        {
            System.out.println(quePeek());
            remove();
        }
    }

}
