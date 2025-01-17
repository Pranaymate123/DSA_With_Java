package Strings;

public class Counting_Words_With_A_Given_Prefix {

    public  static  int prefixCount(String[] words, String pref) {
        int result=0;
        for(String w:words)
        {
            if(isPrefix(w,pref))
            {
                result++;
            }
        }
        return result;
    }

    public static boolean isPrefix(String word,String pref)
    {
        return word.startsWith(pref);
    }


    public static void main(String[] args) {
        String[] words={"pay","attention","practice","attend"};
        System.out.println(prefixCount(words,"at"));
    }
}
