package Array_Package;

import java.util.HashSet;
import java.util.Set;

public class ContainerWithMostWater  {

    public static int getMaxContainer(int arr[])
    {
        if(arr.length <2)
        {
            return 0;
        }
        int s=0;
        int e=arr.length-1;
        int maxArea=Integer.MIN_VALUE;
        while (s<e)
        {
            int Area= Math.min(arr[s],arr[e]) * (e-s);
            if(Area>maxArea)
            {
                maxArea=Area;
            }

            if(arr[s]<arr[e])
            {
                s++;
            }
            else{
                e--;
            }
        }
        return maxArea;
    }

    public static int getSumPairs(int arr[],int target)
    {
//        Set<Integer> hashSet=new HashSet<>();
//        int count=0;
//        for(int i=0;i<arr.length;i++ )
//        {
//            if(hashSet.contains(target-arr[i]))
//            {
//                count++;
//            }
//            hashSet.add(arr[i]);
//        }
//        if(count>0)
//        {
//            return count;
//        }
//        return -1;

        //by using two pointer
        int count=0;
        int s=0;
        int e=arr.length-1;
        while (s<e)
        {
            int sum=arr[s]+arr[e];
            if(sum==target)
            {
               count++;
               s++;
               e--;
            } else if (sum<target) {
                s++;
            }else{
                e--;
            }
        }
        if(count>0)
        {
            return count;
        }
        return -1;
    }
    public static void main(String[] args) {
//        int arr[]={1,8,6,2,5,4,8,3,7};

//        System.out.println(getMaxContainer(arr));

        int arr[]={1, 2, 3, 4, 5, 6, 7};
        System.out.println(getSumPairs(arr,8));
    }
}
