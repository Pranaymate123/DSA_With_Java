package March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D17_Insert_Interval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0;
        List<List<Integer>>  ans=new ArrayList<>();
        while (i<intervals.length)
        {

            if(intervals[i][1] < newInterval[0])
            {

                List<Integer> ds=new ArrayList<>();
                ds.add(intervals[i][0]);
                ds.add(intervals[i][1]);
//                System.out.println(ds);
                ans.add(new ArrayList<>(ds));
            } else if (intervals[i][0] > newInterval[1]) {
                List<Integer> ds=new ArrayList<>();
                ds.add(newInterval[0]);
                ds.add(newInterval[1]);
//                System.out.println(ds);
                ans.add(new ArrayList<>(ds));
                break;
            }
            else
            {
                newInterval[0]=Math.min(intervals[i][0] , newInterval[0]);
                newInterval[1]= Math.max(intervals[i][1] , newInterval[1]);
            }
            i++;
        }


        while (i<intervals.length)
        {
            List<Integer> ds=new ArrayList<>();
            ds.add(intervals[i][0]);
            ds.add(intervals[i][1]);
            i++;
            ans.add(new ArrayList<>(ds));
        }

        int [][] result=new int[ans.size()][2];
        for(int j=0;j<ans.size();j++)
        {
            result[j][0]=ans.get(j).get(0);
            result[j][1]=ans.get(j).get(1);
        }
        return result;
    }
    public static void main(String[] args) {
//        int[][] intervals={{1,2},{3,5},{6,7},{8,10},{12,16}};
//        int [] newInterval={4,8};
        int[][] intervals={{1,3},{6,9}};
        int []newInterval={2,5};


        int [][] result=insert(intervals,newInterval);

        for (int[] arr:result)
        {
            System.out.println(Arrays.toString(arr));
        }
    }
}
