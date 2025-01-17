package Accenture_Coding_Pyq;

public class Largest_Size_Of_Word {
    public static String getLargestSizeOfWord(String str)
    {
        int i=0;
        int j=0;
        int maxLen=0;
        String result="";
        while (j<str.length())
        {
            if(str.charAt(j)=='.')
            {
                if(maxLen<(j-i))
                {
                    maxLen=j-i;
                    result=str.substring(i,j);
                }
                i=j+1;
            }
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
        String str="Java.is.my.favourite.programming.language";
        System.out.println(getLargestSizeOfWord(str));
    }
}
