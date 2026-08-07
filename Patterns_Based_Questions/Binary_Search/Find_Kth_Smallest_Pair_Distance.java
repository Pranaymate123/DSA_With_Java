package Patterns_Based_Questions.Binary_Search;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Find_Kth_Smallest_Pair_Distance {



    public static  int getNumOfPossiblePairs(int[] nums, int distance )
    {
        int i=0;
        int j=1;
        int n = nums.length;
        int totalPairs = 0;

        while (j < n)
        {
            int diff = Math.abs(nums[i]-nums[j]);

            if(diff > distance)
            {
                i++;
                if(i==j)
                {
                    j++;
                }
            }
            else{
                totalPairs = totalPairs + j-i;
                j++;
            }
        }

        return totalPairs;

    }
    public static int smallestDistancePair(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);

        int l = 0;
        int h = nums[n-1];
        int ans=-1;
        while (l<=h)
        {
            int mid = l + (h - l )/2;

            int pairs =  getNumOfPossiblePairs(nums,mid);

            if(pairs < k ) {
                l = mid+1;
            }
            else{
                ans=mid;
                h=mid-1;

//                so at the kth minimum distance there must be at least k pairs and uit can have the more than that also
                //That is why even if the pairs > k we still conside it as our answer 
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,1};
        int k =1 ;

        System.out.println(smallestDistancePair(nums,k));
    }
}


//    public static  int getMax(int[] nums)
//    {
//        int max = Integer.MIN_VALUE;
//        for(int n:nums)
//        {
//            max= Math.max(n,max);
//        }
//        return max;
//    }

//        int maxEle = getMax(nums);
//        int n = nums.length;
//         int[] map = new int[maxEle + 1];
//
//         for(int i=0;i<n;i++)
//         {
//             for(int j=i+1;j<n;j++)
//             {
//                 map[Math.abs(nums[i] - nums[j])]++;
//             }
//         }
//
//         for(int i=0;i<map.length;i++)
//         {
//             k = k - map[i];
//
//             if(k<=0)
//             {
//                 return i;
//             }
//         }
//
//         return -1;
//        Brute Force \\\
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a); //Max Heap
//        int n = nums.length;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=i+1;j<n;j++)
//            {
//                pq.add(Math.abs(nums[i]-nums[j]));
//                if(pq.size() > k )
//                {
//                    pq.poll();
//                }
//            }
//        }
//
//       if(pq.peek()==null) return -1;
//
//       return pq.peek();