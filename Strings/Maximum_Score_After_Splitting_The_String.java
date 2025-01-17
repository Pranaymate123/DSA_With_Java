package Strings;

import java.util.Arrays;

public class Maximum_Score_After_Splitting_The_String {

    public  static int maxScore(String s) {
        if(s.length()<=1) return 0;
        if(s.length()==2) {
            if(s.equals("00")) return 1;
            if(s.equals("01")) return 2;
            if(s.equals("11")) return 1;
            if(s.equals("10")) return 0;
        }
        int [] zeroTrack=new int[s.length()];
        int[] oneTrack=new int[s.length()];
        int countZero=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                countZero+=1;
            }
            zeroTrack[i]=countZero;
        }
        int oneCount=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
                oneCount+=1;
            }
            oneTrack[i]=oneCount;
        }
        System.out.println(Arrays.toString(zeroTrack));
        System.out.println(Arrays.toString(oneTrack));
        int max=Integer.MIN_VALUE;


            for(int i=1;i<s.length()-1;i++)
            {
                max=Math.max(oneTrack[i]+zeroTrack[i],max);
            }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
    }
}
