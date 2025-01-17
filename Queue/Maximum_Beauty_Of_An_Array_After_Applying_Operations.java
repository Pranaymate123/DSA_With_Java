package Queue;

import Recursion.Array;

import java.util.*;

class  Pair{
    int first;
    int last;

    public Pair(int first, int last) {
        this.first = first;
        this.last = last;
    }
}
public class Maximum_Beauty_Of_An_Array_After_Applying_Operations {

        public static int maximumBeauty(int[] nums, int k) {


            List<Pair> lst=new ArrayList<>();

            for(int i=0;i<nums.length;i++)
            {
                lst.add(new Pair(nums[i]-k,nums[i]+k));
            }

            lst.sort((a,b)->a.first-b.first);

            Deque<Pair> que = new LinkedList<>();
            que.add(lst.get(0));

            int result=1;
            int max=0;
            int i=1;
            while(i<lst.size())
            {
                if(que.isEmpty())
                {
                    que.add(lst.get(i));
                    i++;
                    result++;
                }
                else if(que.getFirst().last < lst.get(i).first)
                {
                    //No overlapping
                    que.removeFirst();
                    result--;
                }else
                {
                    que.add(lst.get(i));
                    result++;
                    i++;
                }
                max=Math.max(result,max);
            }

            return max==1?-1:max;
        }

    public static void main(String[] args) {
        int[] nums={4,6,1,2};
        System.out.println(maximumBeauty(nums,2));
    }
}
