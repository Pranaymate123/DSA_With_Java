package Strings;

public class Count_Prefix_And_Suffix_Pairs_I {

    public static int countPrefixSuffixPairs(String[] words) {

        int result=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(i!=j && isPrefixAndSuffix(words[i],words[j]))
                {
//                    System.out.println("Str1 = "+ words[i] + "  ||   Str2 = "+ words[j]);
                    result++;
                }
            }
        }
        return result;
    }

    public static boolean isPrefixAndSuffix(String str1,String str2)
    {
        if(str1.length()>str2.length()) return false;

        for(int i=0;i<str1.length();i++)
        {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(ch1!=ch2) return false;
        }

        int j=str1.length()-1;
        for(int i=str2.length()-1;i>=(str2.length()-str1.length());i--)
        {
            char ch1=str2.charAt(i);
            char ch2=str1.charAt(j);
            if(ch1!=ch2)
            {
                return false;
            }
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        String[] words={"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }
}
