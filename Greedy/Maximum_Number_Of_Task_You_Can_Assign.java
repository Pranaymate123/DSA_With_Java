package Greedy;

import java.util.Arrays;
import java.util.TreeMap;

public class Maximum_Number_Of_Task_You_Can_Assign {

    public static boolean check(int[] tasks, int[] workers, int pills, int strength,int mid)
    {

        int p=pills;

        TreeMap<Integer,Integer> ws=new TreeMap<>();
        for (int i = workers.length - mid; i < workers.length; ++i) {
            ws.put(workers[i], ws.getOrDefault(workers[i], 0) + 1);
        }

        for(int i=mid-1;i>=0;--i)
        {
            Integer key=ws.lastKey();
            if(key>=tasks[i])
            {
                ws.put(key,ws.get(key)-1);
                if(ws.get(key)==0)
                {
                    ws.remove(key);
                }
            }
            else
            {
                if(p==0)
                {
                    return false;
                }
                key=ws.ceilingKey(tasks[i]-strength);
                if(key==null){
                    return false;
                }

                ws.put(key,ws.get(key)-1);
                if(ws.get(key)==0)
                {
                    ws.remove(key);
                }
                --p;
            }
        }
        return true;
    }
    public static int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        int n=tasks.length;
        int m=workers.length;
        int l=1;
        int r=Math.min(m,n);
        int result=0;

        Arrays.sort(workers);
        Arrays.sort(tasks);
        while (l<=r)
        {
            int mid=l+(r-l)/2;
            if(check(tasks,workers,pills,strength,mid))
            {
                result=mid;
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tasks={10,15,30};
        int[] workers={0,10,10,10,10};
        int pills=3;
        int strength=10;

        System.out.println(maxTaskAssign(tasks,workers,pills,strength));
    }
}
