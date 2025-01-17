package Accenture_Revision;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number {

    public static boolean isHappyNumber(int n)
    {
        Set<Integer> set=new HashSet<>();

        while (n!=1 && !set.contains(n))
        {
            set.add(n);
            n=getSumOfSquaresOfDigits(n);
        }
        return n==1;
    }

    public static int getSumOfSquaresOfDigits(int n)
    {
        int sum=0;
        while (n>0)
        {
            int rem=n%10;
            sum+=rem*rem;

            n=n/10;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
    }
}
