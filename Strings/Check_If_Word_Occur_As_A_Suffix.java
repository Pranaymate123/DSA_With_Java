package Strings;

public class Check_If_Word_Occur_As_A_Suffix {

    public static int isPrefixOfWord(String sentence, String searchWord) {
       String[] words=  sentence.split(" ");
       for(int i=0;i<words.length;i++)
       {
           if(isPrefix(words[i],searchWord))
           {
               return i+1;
           }
       }
       return -1;
    }

    public static boolean isPrefix(String word1,String word2)
    {
        if(word1.length()<word2.length()) return false;
        if(word1.equals(word2)) return true;
        int i=0;
        int j=0;
        while (i<word1.length() && j<word2.length())
        {
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(j);

            if(ch1!=ch2)
            {
                return false;
            }
            i++;j++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger","burg"));
    }
}
