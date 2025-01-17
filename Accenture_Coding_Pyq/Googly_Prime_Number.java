package Accenture_Coding_Pyq;

public class Googly_Prime_Number {

    public static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }

    public static boolean isGooglyPrime(int n)
    {
        int sum=0;
        while (n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return isPrime(sum);
    }

    public static void main(String[] args) {
        System.out.println(isGooglyPrime(42));
    }
}
