package Strings;

public class Greatest_Common_Divisor_Of_String {

    public static String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1))
        {
            int gcd=gcd(str1.length(),str2.length());
            return str1.substring(0,gcd);
        }
        else
        {
            return "";
        }

    }
    public static int gcd(int a,int b)
    {
        while ( b%a!=0)
        {
            int rem=b%a;
            b=a;
            a=rem;
        }
        return a;
    }

    public static void main(String[] args) {
        String str1="ABCABCABC";
        String str2="ABCABC";
        System.out.println(gcd(30,48));
        System.out.println(gcdOfStrings(str1,str2));
    }
}
