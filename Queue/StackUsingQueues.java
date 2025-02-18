package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    public static Queue<Integer> q1=new LinkedList<>();
    public static Queue<Integer> q2=new LinkedList<>();

    public static boolean isEmpty()
    {
        return q1.isEmpty() && q2.isEmpty();
    }
    public static void push(int data)
    {
        if(!q1.isEmpty())
        {
            q1.add(data);
        }
        else
        {
            q2.add(data);
        }

    }
    public static int pop()
    {
        int top=-1;
        if(!q1.isEmpty())
        {
            while(!q1.isEmpty())
            {
                top=q1.remove();
                if(q1.isEmpty())
                {
                    break;
                }
                q2.add(top);
            }

        }
        else {
            while(!q2.isEmpty())
            {
             top=q2.remove();
                if(q2.isEmpty())
                {
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }

    public static int peek()
    {
        int top=-1;
        if(!q1.isEmpty())
        {
            while(!q1.isEmpty())
            {
                top=q1.remove();

                q2.add(top);
            }

        }
        else {
            while(!q2.isEmpty())
            {
                top=q2.remove();

                q1.add(top);
            }
        }
        return top;

    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        while (!isEmpty())
        {
            System.out.println(peek());
            pop();
        }

    }
}
