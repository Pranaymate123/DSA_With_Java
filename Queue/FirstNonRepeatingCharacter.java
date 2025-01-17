package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

    public static String firstNonRepeating(String str)
    {
        StringBuilder ans=new StringBuilder("");
        int [] freq=new int[26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while (!q.isEmpty() && freq[q.peek()-'a']>1)
            {
                q.remove();
            }
            if(q.isEmpty())
            {
                ans.append("#");
            }
            else
            {
                ans.append(q.peek());
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s="aabccxb";
        System.out.println(firstNonRepeating(s));
    }
}
