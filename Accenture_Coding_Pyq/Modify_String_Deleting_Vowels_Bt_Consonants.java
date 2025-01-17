package Accenture_Coding_Pyq;

public class Modify_String_Deleting_Vowels_Bt_Consonants {

    public static String getModifiedString(String str)
    {
        int n=str.length();
        StringBuilder result=new StringBuilder();
        result.append(str.charAt(0));
        for(int i=1;i<n-1;i++)
        {
           char ch1=str.charAt(i-1);
           char ch=str.charAt(i);
           char ch2=str.charAt(i+1);
            if(isVowel(ch) && !isVowel(ch1)&&!isVowel(ch2))
            {
                continue;
            }

                result.append(ch);

        }
        result.append(str.charAt(n-1));
        return result.toString();
    }

    public static boolean isVowel(char c)
    {
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public static void main(String[] args) {
        String str="applesarefallingfromtheskies";
        System.out.println(getModifiedString(str));
    }
}
