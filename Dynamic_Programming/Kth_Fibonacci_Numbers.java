package Dynamic_Programming;

public class Kth_Fibonacci_Numbers {

    public static int getKthFibbonacciNumber(int k)
    {
        int prev2=0;
        int prev1=1;
        int curr=0;
        for(int i=2;i<=k;i++)
        {
            curr=prev2+prev1;
            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }

    public static long getKthModifiedFibbonaciNumber(int n)
    {
        long prev2=1;
        long pre1=1;
        long ans=0;
        for(int i=2;i<=n;i++)
        {
            ans=(pre1*pre1) + (prev2*prev2);
            prev2=pre1;
            pre1=ans;
        }
        return pre1%47;
    }
    public static void main(String[] args) {
//        System.out.println(getKthFibbonacciNumber(4));
        System.out.println(getKthModifiedFibbonaciNumber(5));
    }
}
