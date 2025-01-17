package March;

import Recursion.Array;

import java.util.Arrays;

public class D04_March {

    public static int bagOfTokensScore(int[] tokens, int power) {
        int maxScore=Integer.MIN_VALUE;
        int score=0;
        Arrays.sort(tokens);
        if(tokens[0] > power ) return 0;

        int i=0;
        int j=tokens.length-1;
        while (i<=j)
        {
            if(power>=tokens[i])
            {
                score++;
                maxScore=Math.max(score,maxScore);
                power=power-tokens[i];
                i++;
            }
            else if(score>=1)
            {
                score--;
                power+=tokens[j];
                j--;
            }
        }
        return maxScore;

    }
    public static void main(String[] args) {
        int tokens[]={71,55,82};
        int power=54;
        System.out.println(bagOfTokensScore(tokens,power));

    }
}
