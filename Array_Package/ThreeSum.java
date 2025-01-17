package Array_Package;

import Recursion.Array;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> getTriplets(int arr[])
    {
        if(arr.length< 3 )
        {
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        Set<ArrayList<Integer>> mySet=new HashSet<>();
        for(int i=0;i<arr.length-2;i++)
        {
            int left=i+1;
            int right=arr.length-1;
            while(left<right)
            {

            int sum=arr[i]+arr[left]+arr[right];
            if(sum>0)
            {
                right--;
            }
            else if(sum<0)
            {
                left++;
            }
            else {
                ArrayList<Integer> triplet = new ArrayList<>();
                triplet.add(arr[i]);
                triplet.add(arr[left]);
                triplet.add(arr[right]);
                left++;
                right--;

                mySet.add(triplet);
            }

            }

        }
        return new ArrayList<>(mySet);


    }

    public static void main(String[] args) {
//        int[] arr={-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        int []arr={-1,0,1,2,-1,-4};
        System.out.println(getTriplets(arr));

    }
}
