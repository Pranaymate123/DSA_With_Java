package Accenture_Revision;

import java.util.Arrays;

public class Sieve_Of_Erasthothenes {

    public static boolean[] primes;

    public Sieve_Of_Erasthothenes(int n)
    {
        primes=new boolean[n+1];
        Arrays.fill(primes,true);
    }



    public static void main(String[] args) {
        int n=30;
        Sieve_Of_Erasthothenes obj=new Sieve_Of_Erasthothenes(n);
        primes[0]=false;
        primes[1]=false;

        for(int i=2;i*i<=n;i++)
        {
            if(primes[i])
            {
                for(int j=i*i;j<=n;j=j+i)
                {
                    primes[j]=false;
                }
            }
        }

        System.out.println(primes[11]);
        System.out.println(primes[12]);
        System.out.println(primes[13]);


    }
}
