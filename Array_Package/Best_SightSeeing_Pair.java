package Array_Package;

public class Best_SightSeeing_Pair {

    public static int maxScoreSightseeingPair(int[] values) {
        int maxTillIdxAtRight=values[0];
        int maxResult=0;
        for(int j=1;j<values.length;j++)
        {
            int val=values[j]-j;
            maxResult=Math.max(maxResult,maxTillIdxAtRight+val);
            maxTillIdxAtRight=Math.max(maxTillIdxAtRight,values[j]+j);
        }

        return maxResult;
    }

    public static void main(String[] args) {
        int[] nums={8,1,5,2,6};
        System.out.println(maxScoreSightseeingPair(nums));

    }
}
