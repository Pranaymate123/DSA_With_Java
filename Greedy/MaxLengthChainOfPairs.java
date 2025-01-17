package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {

    public static  int getMaxLengthChainOfPairs(int [][] pairs)
    {
        Arrays.sort(pairs, Comparator.comparingInt(p->p[1]));

//        for(int i=0;i<pairs.length;i++)
//        {
//            System.out.println(pairs[i][0] + " "+ pairs[i][1]);
//        }

        int currentPairEnd = pairs[0][1];
        int pairCount=1;
        for(int i=1;i<pairs.length;i++)
        {
            if(currentPairEnd < pairs[i][0])
            {
                pairCount++;
                currentPairEnd=pairs[i][1];
            }
        }
        return pairCount;
    }

    public static void main(String[] args) {
        int arr[][]={
                {1,2},
                {2,3},
                {3,4}

        };
        System.out.println(getMaxLengthChainOfPairs(arr));
    }
}
