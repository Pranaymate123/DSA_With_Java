package Array_Package;

import Recursion.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public  static int [] getIndexes(int [] arr,int target)
    {
        Map<Integer,Integer> hashMap=new HashMap<>();
        int [] ans=new int[2];
        for(int i=0;i<arr.length;i++)
        {

            int num=target-arr[i];
            if(hashMap.containsKey(num))
            {
                ans[1]=i;
                ans[0]=hashMap.get(num);
                break;
            }
            hashMap.put(arr[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int[]ans= getIndexes(arr,9);
        System.out.println(Arrays.toString(ans));
    }
}
