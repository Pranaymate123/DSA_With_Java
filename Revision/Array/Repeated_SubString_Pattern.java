package Revision.Array;

public class Repeated_SubString_Pattern {
    public static boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<s.length();i++)
        {
            if(isSubString(s.substring(0,i),s.length(),s))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean isSubString(String substr,int n,String s)
    {
        if(n%substr.length()!=0) return false;

        int num=n/substr.length();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<num;i++)
        {
            result.append(substr);
            if(!s.contains(result))
            {
                return false;
            }
        }
        return result.toString().equals(s);
    }
    public static void main(String[] args) {
        String s="aba";
        System.out.println(repeatedSubstringPattern(s));
    }
}
