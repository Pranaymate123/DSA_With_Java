package Greedy;

public class MaximumBalancedStringPartitions {

    public static int getMaximumBalancedSubstrings(String s)
    {
        if(s.length()<1)
        {
            return -1;
        }
        int r=0;
        int l=0;
        int finalCount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                r++;
            }
            else
            {
                l++;
            }

            if(r==l)
            {
                finalCount++;
            }
        }
        return finalCount;
    }

    public static void main(String[] args) {
        String s="LRLLRRLRRL";
        System.out.println(getMaximumBalancedSubstrings(s));
    }
}
