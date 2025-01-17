package Backtracking_CodeStoryWithMik;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Count_Ways_To_Build_Good_String {



    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp=new int[high+1];
        Arrays.fill(dp,-1);
        int result=solve(0,low,high,zero,one,dp);
        return result % (1000000000+7);
    }

    public int solve(int length,int low,int high,int zero,int one,int[] dp)
    {
        if(length>high) return 0;
        if(dp[length]!=-1) return dp[length];

        boolean addOne=false;
        if(length>=low)
        {
            addOne=true;
        }
        // add one
       int OneAppend = solve(length+one,low,high,zero,one,dp);
        //add zero
      int ZeroAppend= solve(length+zero,low,high,zero,one,dp);
        return dp[length]= (OneAppend+ZeroAppend+((addOne)?1:0))   % (1000000000+7);
    }



    public static void main(String[] args) {
        Count_Ways_To_Build_Good_String c=new Count_Ways_To_Build_Good_String();
        System.out.println( c.countGoodStrings(2,3,1,2));

//        StringBuilder word=new StringBuilder();
//        word.append("pranay");
//        String zeroCount="000";
//        word.append(zeroCount);
//
//            word.replace(word.length()-zeroCount.length(),word.length(),"");
//
//        System.out.println(word);

    }
}
