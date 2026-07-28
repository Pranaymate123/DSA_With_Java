package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;


import java.util.*;

public class Sliding_Window_Maximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {


//        Story Points:
//
//      1.  When new element comes nums[i], make space for it (window size can't be greater than k).
//      2.  Now, when nums[i] comes, there is no need to keep small elements in that window, pop them.
//      3.  Now push i in deque → for nums[i].
//      4.  If (i >= k - 1), then deq.front() is our answer for that window.


        int n = nums.length;

        Deque<Integer> deque = new LinkedList<>();

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            while (!deque.isEmpty() && deque.getFirst() <= i-k)
            {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && nums[i] > nums[deque.getLast()])
            {
                deque.removeLast();
            }

            deque.addLast(i);

            if(i>=k-1)
            {
                result.add(nums[deque.getFirst()]);
            }
        }

        int[] ans = new int[result.size()];

       for(int i=0;i<result.size();i++)
       {
           ans[i]=result.get(i);
       }
       return ans;
    }


    public static void main(String[] args) {
        int[] nums ={1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }
}
