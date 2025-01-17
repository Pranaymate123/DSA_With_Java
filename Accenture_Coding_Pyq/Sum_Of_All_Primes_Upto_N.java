package Accenture_Coding_Pyq;

public class Sum_Of_All_Primes_Upto_N {

    public static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n!=i && n%i==0) return false;
        }
        return true;
    }
    public static int getSum(int n)
    {
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum(7));
    }
}
