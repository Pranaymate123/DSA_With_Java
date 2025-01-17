package March;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class D19_Task_Scheduler {

    class Task {
        int time,count;

        public  Task(int t,int c)
        {
            time=t;
            count=c;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        int time=0;
        int [] freq= new  int[26];
        PriorityQueue<Task> pq=new PriorityQueue<>(new Comparator<Task>() {
            public int compare(Task o1, Task o2) {
                return -Integer.compare(o1.count,o2.count);
            }
        });

        for(char task:tasks)
        {
            freq[task-'A']++;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]>=1)
            {
                pq.add(new Task(i,freq[i]));
            }
        }

        Queue<Task> q=new LinkedList<>();
        while (!pq.isEmpty() || !q.isEmpty())
        {
            if (!q.isEmpty() && time-q.peek().time>n)
            {
                pq.add(q.remove());
            }
            if(!pq.isEmpty())
            {
                Task t=pq.remove();
                t.count--;
                t.time=time;
                if(t.count>0)
                {
                    q.add(t);
                }
            }
            time++;
        }

        return time;
    }

    public static void main(String[] args) {
        char [] tasks={'A','A','A','B','B','B'};
        int n=2;
        D19_Task_Scheduler obj=new D19_Task_Scheduler();
        System.out.println(obj.leastInterval(tasks,n));
    }
}
