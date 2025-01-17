package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class GetFirstNegativedOfWindowOfSizeK {
    public static long[] getFirstNegative(int arr[],int k)
    {
        int i=0;
        int j=0;
        List<Integer> lst=new ArrayList<>();
//       long ans[]=new long[arr.length-k+1];
        List<Integer> ans=new ArrayList<>();
        while (j<arr.length)
        {
            if(arr[j]<0)
            {
                lst.add(arr[j]);
            }
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                if(lst.size()==0)
                {
                    System.out.println("hiii");
                    ans.add(0);
                }
                else
                {
                    ans.add(lst.get(0));
                    if(arr[i]==lst.get(0))
                    {
                        lst.remove(0);
                    }
                }
                i++;
                j++;
            }
        }
        long ansArr[]=new long[ans.size()];
        for(int l=0;l<ans.size();l++)
        {
            ansArr[l]=ans.get(l);
        }

        return ansArr;
    }
    public static void main(String[] args) {
        int arr[]={12, -1, -7, 8, -15, 30, 16, 28};
        System.out.println(getFirstNegative(arr,3));
    }
}
