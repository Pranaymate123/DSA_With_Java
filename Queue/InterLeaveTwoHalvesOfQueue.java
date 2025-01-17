package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class InterLeaveTwoHalvesOfQueue {

    public static ArrayList<Integer> getInterleave(int N , Queue<Integer> q1)
    {
        Queue<Integer> q2=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<N/2;i++)
        {
            q2.add(q1.remove());
        }
        while (!q2.isEmpty())
        {
            int front1=q2.remove();
            int front2=q1.remove();
            q1.add(front1);
            ans.add(front1);
            ans.add(front2);
            q1.add(front2);
        }
        return ans;
    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        System.out.println(getInterleave(10,q));
    }
}
