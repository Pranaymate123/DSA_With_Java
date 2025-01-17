package Accenture_Revision;

public class LongestPalindromicSubString {

    public static int getLongestPalindromicSubStringLength(String str)
    {
        return Math.max(forOddLength(str),evenLength(str));
    }

    public static int forOddLength(String str)
    {
        int maxLen=0;
        for(int k=0;k<str.length();k++)
        {
           int i=k;
           int j=k;
           int len=0;
           while (i>=0 && j<str.length())
           {
               int ch1=str.charAt(i);
               int ch2=str.charAt(j);
               if(ch1==ch2)
               {
                   i--;
                   j++;
               }
               else
               {
                   break;
               }
           }

           if((j-i-1)>maxLen)
           {
               maxLen=j-i-1;
           }
        }
        return maxLen;
    }

    public static int evenLength(String str)
    {
        int maxLen=0;
        for(int k=0;k<str.length()-1;k++)
        {
            int i=k;
            int j=k+1;
            int len=0;
            while (i>=0 && j<str.length())
            {
                int ch1=str.charAt(i);
                int ch2=str.charAt(j);
                if(ch1==ch2)
                {
                    i--;
                    j++;
                }
                else {
                    break;
                }
            }

            if((j-i-1)>maxLen)
            {
                maxLen=j-i-1;
            }

        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(getLongestPalindromicSubStringLength("cbcbbc"));

    }
}
