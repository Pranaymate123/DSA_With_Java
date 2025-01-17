package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class K_closest_Points_To_Origin {

    class Pair{
        int key;
        int x;
        int y;

        public Pair(int key, int x, int y) {
            this.key = key;
            this.x = x;
            this.y = y;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> maxHeap=new PriorityQueue<>((a,b)->b.key-a.key);
        for(int i=0;i< points.length;i++)
        {
            int key=points[i][0] * points[i][0] + points[i][1] * points[i][1];
            maxHeap.add(new Pair(key,points[i][0],points[i][1]));

            if(maxHeap.size()>k)
            {
                maxHeap.poll();
            }
        }
        int[][] ans=new int[maxHeap.size()][2];
        int i=0;
        while(!maxHeap.isEmpty())
        {
            Pair p=maxHeap.poll();
            ans[i][0]=p.x;
            ans[i][1]=p.y;
            i++;

        }
        return ans;
    }

    public static void main(String[] args) {
        int [][] arr={
                {1,3},
                {-2,2},
                {5,8},
                {0,1}
        };
        K_closest_Points_To_Origin obj=new K_closest_Points_To_Origin();
        int [][] ans=obj.kClosest(arr,2);

        for (int[] item:ans)
        {
            System.out.println( Arrays.toString(item));
        }
    }
}
