package Revision.Array;

import java.util.List;

public class Maximum_Score_From_SubArray_Minimums {

    public int pairWithMaxSum(List<Integer> arr) {
        int maxSum=0;
        int low1=0;
        int low2=0;
        int i=0;
        int j=1;

        while (i<arr.size()&&j<arr.size())
        {
            low1=Math.min(arr.get(i),arr.get(j));
            low2=Math.max(arr.get(i),arr.get(j));
            maxSum=Math.max(maxSum,low1+low2);
            if(arr.get(j)<low1)
            {
                i++;
                low1=0;
                low2=0;
            }
        }



        return 0;
    }

    public static void main(String[] args) {

    }
}
