package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithUniqueCharacters {

    public static int longestSubString(String str)
    {
        int i=0;
        int j=0;
        int ans=0;
        Set<Character> hash=new HashSet<>();
        while (j<str.length())
        {
            if(!hash.contains(str.charAt(j)))
            {

                ans=Math.max(ans,j-i+1);
                hash.add(str.charAt(j));
                j++;
            }
            else
            {
                while (str.charAt(i)!=str.charAt(j))
                {
                    hash.remove(str.charAt(i));
                    i++;
                }
                hash.remove(str.charAt(i));
                i++;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestSubString("pwwkew"));
    }
}
