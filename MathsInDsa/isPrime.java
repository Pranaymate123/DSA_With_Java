package MathsInDsa;

public class isPrime {
    public static void main(String[] args) {
        System.out.println("Is Prime " +checkPrime(37));
    }

    public static boolean checkPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        while( c*c <=n)
        {
            if(n%c == 0)
            {
                return false;
            }
            c++;
        }
        return true;

    }
}
