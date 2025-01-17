package Accenture_Coding_Pyq;

public class IsPalindrome {

    public static boolean isPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while (i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static String longestPalindromicSubString(String str)
    {
        int startIdx=0;
        int maxLen=1;
        int n=str.length();
        int len=0;
        //odd
        for(int i=0;i<n;i++)
        {
            int l=i;
            int r=i;
            while(l>=0 && r<n)
            {
                if(str.charAt(l)==str.charAt(r))
                {
                    l--;
                    r++;
                }
                else {
                    break;
                }
            }
            len=r-l-1;
            if(maxLen<len)
            {
                startIdx=l+1;
                maxLen=len;
            }
        }
        for(int i=0;i<n-1;i++)
        {
            int l=i;
            int r=i+1;
            while(l>=0 && r<n)
            {
                if(str.charAt(l)==str.charAt(r))
                {
                    l--;
                    r++;
                }
                else {
                    break;
                }
            }
            len=r-l-1;
            if(maxLen<len)
            {
                startIdx=l+1;
                maxLen=len;
            }
        }


        return str.substring(startIdx,startIdx+maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubString("ac"));
    }
}
