package Array_Package;

import Recursion.Array;

public class TrappedRainWater {

    public static int getTrappedWater(int heights[]) {
        int n = heights.length;
        //edgeCases
        if(n<=2 || isAscending(heights) || isDescending(heights))
        {
            return 0;
        }


        ////left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }

        //right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--)
        {
            rightMax[i]=Math.max(heights[i],rightMax[i+1]);
        }

        //loop to get Trappped water
        int trappedWater=0;
        int waterLevel=0;

        for(int i=0;i<n;i++)
        {
            waterLevel=Math.min(leftMax[i],rightMax[i]);

            trappedWater=trappedWater+(waterLevel-heights[i]);
        }
        return trappedWater;

    }

    public static boolean isAscending(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isDescending(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] < arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] heights={4,5,6,7,8};

        System.out.println("Total Trapped Water "+getTrappedWater(heights));
    }
}
