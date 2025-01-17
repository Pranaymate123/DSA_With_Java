package Strings;

public class Make_a_String_SubSequence_Using_Cyclic_Roations {

    public static boolean canMakeSubsequence(String str1, String str2) {
        if(str1.length() < str2.length()) return false;
        if(str1.equals(str2)) return true;
        if(str2.length()==0) return true;
        int j=0;
        for(int i=0;i<str1.length();i++)
        {
            char ch1=str1.charAt(i);
            char ch2=rotate(ch1);
            char ch3=str2.charAt(j);
            if(ch1==ch3 || ch2==ch3)
            {
                j++;
            }

        }

        return j >= str2.length();
    }

    public static char rotate(char ch)
    {
        if(ch=='z')
        {
            return 'a';
        }
        return (char) (ch+(char)1);
    }


    public static void main(String[] args) {
        System.out.println(canMakeSubsequence("abc","ad"));
    }
}
