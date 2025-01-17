package Revision.Array;

import java.util.Arrays;

public class SIEVE_OF_ERASTOTHENES {

    public static boolean isPrime(int[] primes,int num)
    {
        return primes[num]==1;
    }

    public static int nonSpecialCount(int l, int r) {
        if(l==r) return 1;
        int[] primes=new int[r+1];
        Arrays.fill(primes,1);
        primes[0]=0;
        primes[1]=0;
        for(int i=2;i*i<=primes.length;i++)
        {
            if(primes[i]==1)
            {
                for(int j=i*i;j<primes.length;j+=i)
                {
                    primes[j]=0;
                }
            }
        }

        int cnt=0;
        for(int i=l;i<=r;i++)
        {
            double idx= Math.sqrt(i);
            if(idx%1==0 && primes[(int)idx]==1)
            {
                cnt++;
            }
        }
        int range=r-l+1;
        return range-cnt;
    }

    public static void main(String[] args) {
        int[] primes=new int[31];
        Arrays.fill(primes,1);
        for(int i=2;i*i<=primes.length;i++)
        {
            if(primes[i]==1)
            {
                for(int j=i*i;j<primes.length;j+=i)
                {
                    primes[j]=0;
                }
            }
        }
        System.out.println(primes[29]);



//        System.out.println(nonSpecialCount(10086764,96508040));
    }
}
