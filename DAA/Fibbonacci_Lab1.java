package DAA;

public class Fibbonacci_Lab1 {

    public static int  getNthFibonnaciNumber(int n)
    {
        int stepCount=0;
        if(n<=1)
        {
            System.out.println("Step Count Required "+stepCount);
            return n;
        }
        int prev2=0;
        int prev1=1;
        int curr=0;
        for(int i=2;i<=n;i++)
        {
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
            stepCount++;
//            System.out.println(curr);
        }
        System.out.println("Step Count Required "+stepCount);
        return curr;
    }


    public static int helper(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return helper(n-1)+helper(n-2);
    }
    public static int getNthFibbonacciNumberWithRecursion(int n)
    {
        return helper(n);
    }

    public static void main(String[] args) {
        int n = 20;
        Runtime runtime=  Runtime.getRuntime();
        runtime.gc();
        long startMemory=runtime.totalMemory()-runtime.freeMemory();
        long startTime=System.nanoTime();
        int iterativeResult=getNthFibonnaciNumber(n);
        long endTime=System.nanoTime();
        long endMemory=runtime.totalMemory()-runtime.freeMemory();
        System.out.println(n+"th Fibbonaci Number is "+ iterativeResult);
        System.out.println("Time Taken in nanosecond "+ (endTime-startTime));
        System.out.println("Space Taken in Bytes "+(endMemory-startMemory));

        System.out.println("-------------------------------------------");
        runtime.gc();
        long RstartMemory=runtime.totalMemory()-runtime.freeMemory();
        long RstartTime=System.nanoTime();
        int recursiveResult=getNthFibbonacciNumberWithRecursion(n);
        long RendTime=System.nanoTime();
        long RendMemory=runtime.totalMemory()-runtime.freeMemory();
        System.out.println(n+   "th Fibbonaci Number is "+ recursiveResult);
        System.out.println("Time Taken in nanosecond "+ (RendTime-RstartTime));
        System.out.println("Space Taken in Bytes "+(RendMemory-RstartMemory));



//        // Time and Space for Iterative Program
//        Runtime runtime = Runtime.getRuntime();
//        runtime.gc(); // Run garbage collector to clear memory before measurement
//        long startMemory = runtime.totalMemory() - runtime.freeMemory();
//        long startTime = System.nanoTime();
//
//        int iterativeResult = getNthFibonnaciNumber(n);
//
//        long endTime = System.nanoTime();
//        long endMemory = runtime.totalMemory() - runtime.freeMemory();
//
//        System.out.println("Fibonacci Number (Iterative) is: " + iterativeResult);
//        System.out.println("Time for Iterative Program (nanoseconds): " + (endTime - startTime));
//        System.out.println("Memory used by Iterative Program (bytes): " + (endMemory - startMemory));
//
//        // Time and Space for Recursive Program
//        runtime.gc();
//        startMemory = runtime.totalMemory() - runtime.freeMemory();
//        long recursiveStartTime = System.nanoTime();
//
//        int recursiveResult = getNthFibbonacciNumberWithRecursion(n);
//
//        long recursiveEndTime = System.nanoTime();
//        endMemory = runtime.totalMemory() - runtime.freeMemory();
//
//        System.out.println("Fibonacci Number (Recursive) is: " + recursiveResult);
//        System.out.println("Time for Recursive Program (nanoseconds): " + (recursiveEndTime - recursiveStartTime));
//        System.out.println("Memory used by Recursive Program (bytes): " + (endMemory - startMemory));
    }
}
