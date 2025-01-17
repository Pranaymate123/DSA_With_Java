package March;

import java.util.*;

public class D10_Intersection_Of_two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hashMap=new HashMap<>();
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            hashMap.put(nums2[i],1);
        }

        for(int i=0;i<nums1.length;i++)
        {
            if(hashMap.containsKey(nums1[i]) && hashMap.get(nums1[i])==1)
            {
                lst.add(nums1[i]);
                hashMap.put(nums1[i],0);
            }
        }
        int ans[]=new int[lst.size()];
        for(int i=0;i<lst.size();i++)
        {
            ans[i]=lst.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={4,9,5};
        int num[]={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr,num)));
    }
}
