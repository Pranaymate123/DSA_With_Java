package SlidingWindow.Variable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWithNoRepeatingCharacters {

    public static int getLongestSubString(String str)
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
        String str="abcabcbb";
        System.out.println(getLongestSubString(str));
    }
}
