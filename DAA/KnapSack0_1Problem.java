package DAA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class  Node{
    int profit;
    int weight;

    public Node(int profit,int weight)
    {
        this.profit=profit;
        this.weight=weight;
    }
}
public class KnapSack0_1Problem {



    //n--> no. of items
    public static int knapsack(int capacity, List<Node> itemList, int idx,int[][] dp)
    {
        //base case when  capacity is zero return 0
        if(capacity==0 ) return 0;

        // base case when all items are taken and index goes out of list
        if(idx>=itemList.size()) return 0;

        //if Dp  already has the value for it then use that
        if(dp[idx][capacity]!=-1)
        {
            return dp[idx][capacity];
        }

        //if the Nth item weight is greater as compare to capacity
        //unlike fractional knapack we cannot divide it so that skip it
        if(itemList.get(idx).weight>capacity)
        {
          int ans= knapsack(capacity,itemList,idx+1,dp);
            dp[idx][capacity]=ans;
            return ans;
        }
        else
        {
            //calculate the take , not take
            int takeProfit= itemList.get(idx).profit+knapsack(capacity-itemList.get(idx).weight,itemList,idx+1,dp);
            int notTakeProfit=knapsack(capacity,itemList,idx+1,dp);
            int maxProfit= Math.max(takeProfit,notTakeProfit);
            dp[idx][capacity] =maxProfit;
        }
        return dp[idx][capacity];
    }


    public static void main(String[] args) {

        List<Node> itemList=new ArrayList<>();


        itemList.add(new Node(5,1));
        itemList.add(new Node(10,3));
        itemList.add(new Node(15,5));
        itemList.add(new Node(7,4));
        itemList.add(new Node(8,1));
        itemList.add(new Node(9,3));
        itemList.add(new Node(4,2));


        int capacity=15;
        int n=itemList.size();
        int[][] dp=new int[n+1][capacity+1];
        for(int[] a:dp)
        {
            Arrays.fill(a,-1);
        }
        System.out.println("Maximum Profit Generated are : "+ knapsack(capacity,itemList,0,dp));
    }
}
