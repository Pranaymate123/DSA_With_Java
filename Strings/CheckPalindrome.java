package Strings;

public class CheckPalindrome {
    public static boolean checkPalindrome(String str)
    {
        StringBuilder sb=new StringBuilder("");
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i)))
            {
                sb.append(str.charAt(i));
            }
        }

        int s=0;
        int e=sb.length()-1;
        while (s<=e)
        {
            if(sb.charAt(s)!=sb.charAt(e))
            {
                return  false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(str));
    }
}
