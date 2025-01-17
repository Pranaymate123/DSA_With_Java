package Recursion;

public class TilingProblem {

    public static int getNoOfWays(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int fnm1=getNoOfWays(n-1);
        int fnm2=getNoOfWays(n-2);

        return fnm1+fnm2;
    }

    public static void main(String[] args) {
        System.out.println(getNoOfWays(3));
    }
}
