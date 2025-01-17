package MathsInDsa;

public class CehckPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPali(122212221));
    }

    public  static  boolean checkPali(int n)
    {
        if(n==Reverse(n))
        {
            return true;
        }
        return false;
    }
    public static int Reverse(int n)
    {
        int rev=0;
        int pow=0;
        while(n>0)
        {
            int rem=n%10;
            rev=  rev * 10 +rem;
            pow++;
            n=n/10;
        }
        return rev;
    }
}
