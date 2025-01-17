package SlidingWindow;

import java.util.*;

public class MaximumOfAllSubArrayOfSizeK {

    public static int[] getMax(int arr[],int k)
    {
        int i=0;
        int j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        Deque<Integer> deque=new ArrayDeque<>();
        while(j<arr.length)
        {
            if(deque.isEmpty())
            {
                deque.add(arr[j]);
            }
            else {
                while (deque.size()>0 && deque.getLast()<arr[j])
                {
                    deque.removeLast();
                }
                deque.add(arr[j]);
//                if(arr[j] > deque.getFirst())
//                {
//                    while (!deque.isEmpty())
//                    {
//                        deque.removeLast();
//                    }
//                    deque.add(arr[j]);
//                }
//                else{
//                    deque.add(arr[j]);
//                }
            }
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                if(!deque.isEmpty())
                {
                    ans.add(deque.getFirst());
                }
                if(arr[i]==deque.getFirst())
                {
                    deque.removeFirst();

                }
                i++;
                j++;
            }
        }

        int ansArr[]=new int[ans.size()];
        for(int l=0;l<ans.size();l++)
        {
            ansArr[l]=ans.get(l);
        }
        return ansArr;
    }


    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(getMax(arr,3))) ;
    }
}
