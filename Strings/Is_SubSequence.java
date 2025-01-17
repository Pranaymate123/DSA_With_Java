package Strings;

public class Is_SubSequence {

    public static boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        int first=0;
        int second=0;
        while (second<t.length() && first < s.length())
        {
            char ch=s.charAt(first);
            if(t.charAt(second)==ch)
            {
                first++;
                second++;
            }
            else
            {
                second++;
            }
        }
        return first >= s.length();
    }

    public static void main(String[] args) {
        String s="acb";
        String t="anbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
