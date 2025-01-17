package Accenture_Revision;

public class FibbonacciNumbers {

    public static int getNthFibonacciNumber(int n)
    {
        if(n<=1) return n;
        int prev2=0;
        int prev1=1;
        int curr=0;
        for(int i=2;i<=n;i++)
        {
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
            System.out.println(curr + " ");
        }

        return curr;
    }

    public static void main(String[] args) {
        System.out.println("Ans is ");
        System.out.println(getNthFibonacciNumber(5));
    }
}
