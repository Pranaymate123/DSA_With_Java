package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
         Arrays.sort(coins);
        int count=0;

        for(int i=coins.length-1;i>=0;i--)
        {

            if(coins[i] <= amount && amount!=0)
            {
                while (coins[i]<=amount &&  amount!=0 )
                {
                    amount=amount-coins[i];
                    count++;
                }
            }
        }
            return count;
    }

    public static void main(String[] args) {
        int [] coins={186,419,83,408};
        System.out.println(coinChange(coins,6249));
    }
}
