package Accenture_Coding_Pyq;

import java.util.Arrays;

public class Sieve_Of_Eratoshthenes {


    public static void main(String[] args) {
        int N=20;
        boolean[] primes=new boolean[21];
        Arrays.fill(primes,true);
        primes[0]=false;
        primes[1]=false;
        for(int i=2;i*i<N;i++)
        {
            if(primes[i])
            {
                for(int j=i*i;j<=N;j=j+i)
                {
                    primes[j]=false;
                }
            }
        }
        System.out.println(Arrays.toString(primes));
        System.out.println(primes[16]);
    }
}
