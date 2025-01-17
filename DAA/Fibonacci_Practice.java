package DAA;

public class Fibonacci_Practice {

    //Iterative Approach
    public static int getNthFibonacciNumber(int n)
    {
        int prev2=0;
        int prev1=1;
        int curr=0;
        for(int i=2;i<=n;i++)
        {
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }

    //Recursive
    public static int getNthFibonacciWithRecursion(int n)
    {
        //base
        if(n<=1) return n;
        return getNthFibonacciWithRecursion(n-1)+getNthFibonacciWithRecursion(n-2);
    }

    public static void main(String[] args) {
        int n=20;
        Runtime runtime=Runtime.getRuntime();
        runtime.gc();
        long startMemory=runtime.totalMemory()-runtime.freeMemory();
        long startTime=System.nanoTime();
       int iterativeResult = getNthFibonacciNumber(n);
       long endTime=System.nanoTime();
       long endMemory=runtime.totalMemory()-runtime.freeMemory();


        System.out.println(n+"th Fibonacci Number is "+ iterativeResult);
        System.out.println("Time Required in Nano Seconds "+(endTime-startTime));
        System.out.println("Space Required in Bytes "+(endMemory-startMemory));

        System.out.println("-----------------------------------------------");
         runtime.gc();
        long RstartMemory=runtime.totalMemory()-runtime.freeMemory();
        long RstartTime=System.nanoTime();
       int recursiveResult =getNthFibonacciWithRecursion(n);
       long RendTime=System.nanoTime();
       long RendMemory=runtime.totalMemory()-runtime.freeMemory();


        System.out.println(n+"th Fibonacci Number is "+ recursiveResult);
        System.out.println("Time Required in Nano Seconds "+(RendTime-RstartTime));
        System.out.println("Space Required in Bytes "+(RendMemory-RstartMemory));
    }
}
